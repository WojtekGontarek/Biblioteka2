import java.util.ArrayList;

public class Bibliotekarz {
//    Bibliotekarz:   imię, nazwisko, stanowisko, numer telefonu, adres e-mail
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private String nr_telefonu;
    private String email;

    static public ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();
    
    public void wypozycz(Ksiazka ksiazka, Czytelnik czytelnik) {
        wypozyczenia.add(new Wypozyczenie(ksiazka, czytelnik, null, false));
    }
    public void zwroc(Wypozyczenie wypozyczenie) {
        wypozyczenia.remove(wypozyczenie);
    }

    static ArrayList<Wypozyczenie> wyszukajWypozyczeniaCzytelnika(Czytelnik czytelnik){
        ArrayList<Wypozyczenie> znalezioneWypozyczenia = new ArrayList<>();
        for (Wypozyczenie wypozyczenie: wypozyczenia) {
            if (wypozyczenie.getCzytelnik().equals(czytelnik)) znalezioneWypozyczenia.add(wypozyczenie);
        }

        return (znalezioneWypozyczenia.isEmpty()) ? null : znalezioneWypozyczenia;
    }
}

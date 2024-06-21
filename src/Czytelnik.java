import java.util.ArrayList;

public class Czytelnik {
//    Czytelnik: imię, nazwisko, data urodzenia, adres, e-mail, numer telefonu, lista wypożyczonych książek
    private String imie;
    private String nazwisko;
    private String data_urodzenia;
    private String adres;
    private String email;
    private int nr_telefonu;
    private ArrayList<Ksiazka> lista_wypozyczonych_ksiazek = new ArrayList<>();

    static ArrayList<Czytelnik> czytelnicy = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, String data_urodzenia, String adres, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.adres = adres;
        this.email = email;
    }

//    gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public String getAdres() {
        return adres;
    }

    public String getEmail() {
        return email;
    }

    public int getNrTelefonu() {
        return nr_telefonu;
    }

    public void dodajCzytelnikaDo(ArrayList<Czytelnik> czytelnicy){
        czytelnicy.add(this);
    }

    public void usunCzytelnikaZ(ArrayList<Czytelnik> czytelnicy){
        czytelnicy.remove(this);
    }

    static Czytelnik wyszukajCzytelnikaPoImieniu(String imie){
        for (Czytelnik czytelnik: czytelnicy) {
            if (czytelnik.getImie().equals(imie)) return czytelnik;
        }
        return null;
    }
    static Czytelnik wyszukajCzytelnikaPoNazwisku(String nazwisko){
        for (Czytelnik czytelnik: czytelnicy) {
            if (czytelnik.getNazwisko().equals(nazwisko)) return czytelnik;
        }
        return null;
    }
    static Czytelnik wyszukajCzytelnikaPoNumerzeTelefonu(int nrtel){
        for (Czytelnik czytelnik: czytelnicy) {
            if (czytelnik.getNrTelefonu() == nrtel) return czytelnik;
        }
        return null;
    }

    
}

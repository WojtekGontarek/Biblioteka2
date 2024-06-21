import java.util.ArrayList;
import java.util.Objects;

public class Ksiazka {
    private final String tytul;
    private final String wydawnictwo;
    private final String autor;
    private final int rokWydania;
    private final int liczba_egzemplarzy;
    private final int liczba_egzemplarzy_wypozyczonych;

    static ArrayList<Ksiazka> ksiazki = new ArrayList<>();

    public Ksiazka(String tytul, String wydawnictwo, String autor, int rokWydania, int liczba_egzemplarzy, int liczba_egzemplarzy_wypozyczonych) {
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczba_egzemplarzy = liczba_egzemplarzy;
        this.liczba_egzemplarzy_wypozyczonych = liczba_egzemplarzy_wypozyczonych;
    }

    public String getTytul() {
        return tytul;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }
    @Override
    public String toString(){
        return String.format("%s; %s", tytul, autor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return Objects.equals(tytul, ksiazka.tytul) && Objects.equals(autor, ksiazka.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, autor);
    }


    public void dodajKsiazkeDo(ArrayList<Ksiazka> ksiazki){
        ksiazki.add(this);
    }

    public void usunKsiazkeZ(ArrayList<Ksiazka> ksiazki){
        ksiazki.remove(this);
    }


    static Ksiazka wyszukajKsiazkePoTytule(String tytul){
        for (Ksiazka ksiazka: ksiazki) {
            if (ksiazka.getTytul().equals(tytul)) return ksiazka;
        }
        return null;
    }
    static ArrayList<Ksiazka> wyszukajKsiazkePoAutorze(String autor){
        ArrayList<Ksiazka> znalezioneKsiazki = new ArrayList<>();
        for (Ksiazka ksiazka: ksiazki) {
            if (ksiazka.getAutor().equals(autor)) znalezioneKsiazki.add(ksiazka);
        }

        return (znalezioneKsiazki.isEmpty()) ? null : znalezioneKsiazki;
    }
    static ArrayList<Ksiazka> wyszukajKsiazkePoWydawnictwie(String wydawnictwo){
        ArrayList<Ksiazka> znalezioneKsiazki = new ArrayList<>();
        for (Ksiazka ksiazka: ksiazki) {
            if (ksiazka.getWydawnictwo().equals(wydawnictwo)) znalezioneKsiazki.add(ksiazka);
        }

        return (znalezioneKsiazki.isEmpty()) ? null : znalezioneKsiazki;
    }

}

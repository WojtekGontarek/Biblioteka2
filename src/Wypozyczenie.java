import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Wypozyczenie {

    private LocalDate dataWypozczenia;
    private LocalDate dataZwrotu;
    private boolean informacja_o_zwrocie;
    private Czytelnik czytelnik;
    private Ksiazka ksiazka;

    public ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();

    public Wypozyczenie(Ksiazka ksiazka, Czytelnik czytelnik, LocalDate dataZwrotu, boolean informacja_o_zwrocie) {
        this.czytelnik = czytelnik;
        this.ksiazka = ksiazka;
        this.dataWypozczenia = LocalDate.now();
        this.dataZwrotu = dataZwrotu;
        this.informacja_o_zwrocie = informacja_o_zwrocie;
    }

    public LocalDate getDataWypozczenia() {
        return dataWypozczenia;
    }

    public String getTytulKsiazki() {
        return ksiazka.getTytul();
    }

    public Czytelnik getCzytelnik() {
        return czytelnik;
    }
}

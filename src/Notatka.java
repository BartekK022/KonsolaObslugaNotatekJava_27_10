public class Notatka {
    private static int licznikNotatek;
    private int id = 0;
    protected String tytulNotatki;
    protected String trescNotatki;


    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        licznikNotatek++;
        id = licznikNotatek;
    }

    public void wyswietlTytulITresc() {
        String stringTytul = tytulNotatki;
        String stringTresc = trescNotatki;
        System.out.println("Tytuł: " + stringTytul + " treść: "
                + stringTresc);
    }

    public void wypiszZawartosc() {
        System.out.println(licznikNotatek + "; " + id + "; "
                + tytulNotatki + "; " + trescNotatki + "; ");

    }
}

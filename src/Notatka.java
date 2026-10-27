public class Notatka {
    private int licznikNotatek;
    private int  id;
    protected String tytulNotatki;
    protected String trescNotatki;


    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        licznikNotatek++;
        id = licznikNotatek;
    }
    public static void wyswietlTytulITresc(){
        

    }
}

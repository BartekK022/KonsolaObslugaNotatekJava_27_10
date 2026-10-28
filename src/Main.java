import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytul notatki: ");
        String stringTytulNotatki = scanner.nextLine();
        System.out.println("Podaj treśc notatki: ");
        String stringTrescNotatki = scanner.nextLine();
        Notatka notatka = new Notatka(stringTytulNotatki, stringTrescNotatki);
        notatka.wypiszZawartosc();
        notatka.wyswietlTytulITresc();
        System.out.println("Podaj tytul drugiej notatki: ");
        stringTytulNotatki = scanner.nextLine();
        System.out.println("Podaj tresc drugiej notatki: ");
        stringTrescNotatki = scanner.nextLine();
        Notatka notatka1 = new Notatka(stringTytulNotatki, stringTrescNotatki);
        notatka1.wyswietlTytulITresc();
        notatka1.wypiszZawartosc();


    }
}
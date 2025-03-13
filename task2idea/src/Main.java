import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Miasto: ");
        String Miasto = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();
        System.out.println("Podaj dzień tygodnia: ");
        String dzien = sc.next();
        double cena=40;
        if (wiek < 10) {
            cena = cena - cena;
        }
        if (wiek > 10 && wiek < 18) {
            cena = cena - cena * (0.5);
        }
        if (Miasto.equals("Warszawa") || Miasto.equals("warszawa")) {
            if (wiek < 10) {
                cena = 0;
            }
            cena = (cena - cena * (0.1));
        }
        if (dzien.equals("czwartek") || dzien.equals("Czwartek")) {
            cena = 0;
        }
        System.out.println(Miasto + ", wiek:" + wiek + ", " + dzien + ", cena:" + cena + "zł");
    }
}
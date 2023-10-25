package at.bxa.basis;
import java.util.Scanner;

public class Bankautomat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ein Scanner-Objekt für Benutzereingaben

        double kontostand = 0; // Anfangskontostand

        System.out.println("Willkommen beim Bankautomaten!");

        while (true) {
            System.out.println("\nBitte wählen Sie eine Aktion:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
            System.out.print("Eingabe: ");

            int auswahl = scanner.nextInt(); // Benutzereingabe lesen

            if (auswahl == 1) {
                System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
                double betrag = scanner.nextDouble();
                kontostand += betrag; // Kontostand erhöhen
                System.out.println(betrag + " Euro wurden eingezahlt. Neuer Kontostand: " + kontostand + " Euro");
            } else if (auswahl == 2) {
                System.out.print("Geben Sie den Abhebungsbetrag ein: ");
                double betrag = scanner.nextDouble();
                if (betrag > kontostand) {
                    System.out.println("Nicht genug Geld auf dem Konto.");
                } else {
                    kontostand -= betrag; // Kontostand verringern
                    System.out.println(betrag + " Euro wurden abgehoben. Neuer Kontostand: " + kontostand + " Euro");
                }
            } else if (auswahl == 3) {
                System.out.println("Ihr Kontostand beträgt: " + kontostand + " Euro");
            } else if (auswahl == 4) {
                System.out.println("Vielen Dank, dass Sie den Bankautomaten benutzt haben. Auf Wiedersehen!");
                break;
            } else {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie 1, 2, 3 oder 4.");
            }
        }
    }
}

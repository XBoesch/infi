package at.bxa.basis.kleidung;

import java.util.ArrayList;
import java.util.Random;

public class TestIt {
    public static void main(String[] args) {
        Random r = new Random();
        Schrank schrank = new Schrank(10, "Musterstraße 1, 12345 Musterstadt", 10, 0.0); // Annahme: 10 Fächer, keine Miete
        System.out.println("Schrank-Adresse: " + schrank.getAdresse());

        // Erstellen von T-Shirts mit zufälligen Eigenschaften
        ArrayList<Tshirt> tShirtListe = new ArrayList<>();
        String[] farben = {"Blau", "Rot", "Grün", "Lila", "Gelb", "Pink", "Türkis"};
        String[] groessen = {"S", "M", "L", "XL", "XXL"};

        for (int i = 1; i <= 50; i++) { // 50 T-Shirts erstellen
            String farbe = farben[r.nextInt(farben.length)];
            String groesse = groessen[r.nextInt(groessen.length)];
            Tshirt tShirt = new Tshirt(groesse, farbe, "Design " + i, "Baumwolle");
            tShirtListe.add(tShirt);
        }

        // Hinzufügen von T-Shirts zum Schrank und Ausgabe der Informationen
        for (Tshirt tShirt : tShirtListe) {
            System.out.println(Tshirt.getTshirtInfo());
            schrank.addTshirt(tShirt);
            System.out.println("Anzahl T-Shirts im Schrank: " + schrank.getAnzahlTShirts());
        }

        // Filtern von T-Shirts nach einer bestimmten Farbe
        schrank.getTshirtsNachFarbe("Rot");

        // Filtern von T-Shirts nach einer bestimmten Größe
        schrank.getTShirtsNachGroesse("M");
    }
}

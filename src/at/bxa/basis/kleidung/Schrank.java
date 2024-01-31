package at.bxa.basis.kleidung;

import java.util.ArrayList;

public class Schrank {
    private int faecher;
    private String adresse;
    private int maxBelastungProFach; // in Kilogramm
    private double mietpreisProMonat;
    ArrayList<Tshirt> tShirtListe;

    public Schrank(int faecher, String adresse, int maxBelastungProFach, double mietpreisProMonat) {
        this.faecher = faecher;
        this.adresse = adresse;
        this.maxBelastungProFach = maxBelastungProFach;
        this.mietpreisProMonat = mietpreisProMonat;
        this.tShirtListe = new ArrayList<>();
    }

    // Getter und Setter Methoden
    public int getFaecher() {
        return faecher;
    }

    public void setFaecher(int faecher) {
        this.faecher = faecher;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getMaxBelastungProFach() {
        return maxBelastungProFach;
    }

    public void setMaxBelastungProFach(int maxBelastungProFach) {
        this.maxBelastungProFach = maxBelastungProFach;
    }

    public double getMietpreisProMonat() {
        return mietpreisProMonat;
    }

    public void setMietpreisProMonat(double mietpreisProMonat) {
        this.mietpreisProMonat = mietpreisProMonat;
    }

    // Methode zum Hinzufügen eines T-Shirts
    public void addTshirt(Tshirt tShirt) {
        if (tShirtListe.size() < faecher * maxBelastungProFach) {
            tShirtListe.add(tShirt);
        } else {
            System.out.println("Der Schrank hat keinen Platz mehr!");
        }
    }

    // Methode, um die Anzahl der T-Shirts im Schrank zu bekommen
    public int getAnzahlTShirts() {
        return tShirtListe.size();
    }

    // Methode, um T-Shirts nach Farbe zu finden
    public void getTshirtsNachFarbe(String farbe) {
        System.out.println("T-Shirts in der Farbe " + farbe + ":");
        for (Tshirt tShirt : tShirtListe) {
            if (tShirt.getFarbe().equals(farbe)) {
                System.out.println(tShirt.getTshirtInfo());
            }

        }
    }

    // Methode, um T-Shirts nach Größe zu filtern
    public void getTShirtsNachGroesse(String groesse) {
        System.out.println("T-Shirts in der Größe " + groesse + ":");
        for (Tshirt tShirt : tShirtListe) {
            if (tShirt.getGroesse().equals(groesse)) {
                System.out.println(tShirt.getTshirtInfo());
            }
        }
    }
}

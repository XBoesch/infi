package at.bxa.basis.oop.auto;

import java.util.ArrayList;

public class Garage {
    private int stellplaetze;
    private String addresse;
    private int einfahrtshoehe;
    private double preisstunde;
    ArrayList<Auto> autoliste;
    public Garage(int stellplaetze, String addresse, int einfahrtshoehe, double preisstunde) {
        this.stellplaetze = stellplaetze;
        this.addresse = addresse;
        this.einfahrtshoehe = einfahrtshoehe;
        this.preisstunde = preisstunde;
        this.autoliste = new ArrayList<Auto>();
    }
    public int getStellplaetze() {
        return stellplaetze;
    }
    public void setStellplaetze(int stellplaetze) {
        this.stellplaetze = stellplaetze;
    }
    public String getAddresse() {
        return addresse;
    }
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    public int getEinfahrtshoehe() {
        return einfahrtshoehe;
    }
    public void setEinfahrtshoehe(int einfahrtshoehe) {
        this.einfahrtshoehe = einfahrtshoehe;
    }
    public double getPreisstunde() {
        return preisstunde;
    }
    public void setPreisstunde(float preisstunde) {
        this.preisstunde = preisstunde;
    }
    public int getAutosinGarage(){
        return this.autoliste.size();
    }
    public int getFreiePlaetze(){
        return this.stellplaetze - getAutosinGarage();
    }
    public void addAutoGarage(Auto auto) {
        //Abfrage ist AUto höher als Garage hoehe
        if(auto.getFahrzeughoehe()>this.einfahrtshoehe){
            System.out.println("Hoi, hast a hohes Auto, leider nid i dera Garage!!!");
        }else if (getFreiePlaetze() > 0) {
            this.autoliste.add(auto);
        } else {
            System.out.println("Upps, Garage keinen Platz mehr frei, versuche es später nochmal!!");
        }
    }

    public int getGesamtFahrzeugeugeUebereinander(){
        int wert =0;
        return wert;
    }
}

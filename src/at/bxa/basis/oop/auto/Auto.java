package at.bxa.basis.oop.auto;

public class Auto {
    private int iLeistung;
    private String sFarbe;
    private int iAnzahlraeder;
    private int fahrzeughoehe;

    public Auto() {
        this.iLeistung=0;
        this.sFarbe="keine Angabe";
        this.iAnzahlraeder=0;
        this.fahrzeughoehe=0;
    }
    public Auto(int iLeistung, String sFarbe, int iAnzahlraeder, int fahrzeughoehe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.iAnzahlraeder = iAnzahlraeder;
        this.fahrzeughoehe=fahrzeughoehe;
    }
    public int getFahrzeughoehe() {
        return fahrzeughoehe;
    }
    public void setFahrzeughoehe(int fahrzeughoehe) {
        this.fahrzeughoehe = fahrzeughoehe;
    }
    public int getiLeistung() {
        return iLeistung;
    }
    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }
    public String getsFarbe() {
        return sFarbe;
    }
    public int getiAnzahlraeder() {
        return iAnzahlraeder;
    }
    public void setiAnzahlraeder(int iAnzahlraeder) {
        this.iAnzahlraeder = iAnzahlraeder;
    }
    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;

    }
    public String getInfoAuto(){
        return "Auto Farbe ist "+ this.getsFarbe()+
                " mit Leistung " + this.getiLeistung() +
                " und das Auto hat "+ this.getiAnzahlraeder()+" R\u00e4der "+
                "Autohöhe "+ this.getFahrzeughoehe();
    }
}

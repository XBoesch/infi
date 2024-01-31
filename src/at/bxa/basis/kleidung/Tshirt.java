package at.bxa.basis.kleidung;

public class Tshirt {
    private String groesse;
    private String farbe;
    private String druck; // Der Java-Code als String
    private String material;

    public Tshirt() {
        this.groesse = "M"; // Standardgröße
        this.farbe = "Weiß"; // Standardfarbe
        this.druck = "Java-Code für 'Auto' Klasse"; // Beschreibung des Drucks
        this.material = "Baumwolle"; // Standardmaterial
    }

    public Tshirt(String groesse, String farbe, String druck, String material) {
        this.groesse = groesse;
        this.farbe = farbe;
        this.druck = druck;
        this.material = material;
    }

    public static int getTshirtInfo() {return(0);
    };

    // Getter und Setter für jedes Attribut
    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getDruck() {
        return druck;
    }

    public void setDruck(String druck) {
        this.druck = druck;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Eine Methode, um Informationen über das T-Shirt zu bekommen
    public String getTShirtInfo() {
        return "T-Shirt in Größe " + groesse + ", Farbe " + farbe +
                ", mit " + druck + " bedruckt, aus " + material + ".";
    }
}
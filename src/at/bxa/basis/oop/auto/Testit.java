package at.bxa.basis.oop.auto;

import java.util.ArrayList;

public class Testit {

    public static void main (String[] args) {
         Random r = new Random();
         Auto auto = new Auto ();
         System.out.println(auto.getInfoAuto());
         auto.setsFarbe("blau");
         auto.setiLeistung(340);
         auto.setiAnzahlReader(4);
         System.out.println(auto.getInfoAuto());

         Auto auto2 = new Auto(iLeistung:340, sFarbe: "blau",iAnzahlReader:4);
         System.out.println(auto2.getInfoAuto());

         ArrayList<Auto> aAutoliste = new ArrayList<>();
         String[] a Farben = ["blau","rot","gruen","violett","gelb","pink","türkis"};
         for(var i=1;i<=100;i++){
             //max = 500 min =50
             int ps = r.nextInt(bound:500 + 1 - 50)+50;
             //max =4 min = 3
             int ra = r.nextint(bound:4 + 1 - 3) + 3;
             // Do forget array zugriff mit Index start bei 0!!
             int fa = r.nextInt(aFarben.length-1)
             aAutoListe.add(new Auto(ps,aFarben[fa],ra));
         }
         for(Auto a : aAutoliste){
             System.out.println(a.getInfoAuto());
         }
    }
}
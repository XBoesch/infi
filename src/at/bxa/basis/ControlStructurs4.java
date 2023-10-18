package at.bxa.basis;

import java.util.Random;

public class ControlStructurs4 {
    public static void main(String[] args) {
        // Erstelle zwei Zufallszahlen zwischen 0 und 100
        Random random = new Random();
        int firstRandomNumber = random.nextInt(100);
        int secondRandomNumber = random.nextInt(100);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if (firstRandomNumber < secondRandomNumber && firstRandomNumber < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"
        if (firstRandomNumber < 30 || secondRandomNumber < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"
        if (firstRandomNumber < 50 && secondRandomNumber != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}


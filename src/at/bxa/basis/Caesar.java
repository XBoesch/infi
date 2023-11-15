package at.bxa.basis;
import java.util.Scanner;
public class Caesar {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (ch + shift);
                if ((Character.isLowerCase(ch) && shifted > 'z') || (Character.isUpperCase(ch) && shifted > 'Z')) {
                    shifted = (char) (ch - (26 - shift));
                }
                ciphertext.append(shifted);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (ch - shift);
                if ((Character.isLowerCase(ch) && shifted < 'a') || (Character.isUpperCase(ch) && shifted < 'A')) {
                    shifted = (char) (ch + (26 - shift));
                }
                plaintext.append(shifted);
            } else {
                plaintext.append(ch);
            }
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Willkommen zum Caesar Cipher Programm!");
            System.out.println("Wählen Sie eine Option:");
            System.out.println("1. Verschlüsseln");
            System.out.println("2. Entschlüsseln");
            System.out.println("3. Programm beenden");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.println("Geben Sie den Text ein, der verschlüsselt werden soll:");
                    String inputText = scanner.nextLine();
                    System.out.println("Geben Sie den Verschiebungswert ein:");
                    int shift = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    String encryptedText = encrypt(inputText, shift);
                    System.out.println("Verschlüsselter Text: " + encryptedText);
                    break;
                case 2:
                    System.out.println("Geben Sie den zu entschlüsselnden Text ein:");
                    String textToDecrypt = scanner.nextLine();
                    System.out.println("Geben Sie den Verschiebungswert ein:");
                    int decryptShift = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    String decryptedText = decrypt(textToDecrypt, decryptShift);
                    System.out.println("Entschlüsselter Text: " + decryptedText);
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Das Programm wird beendet. Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Ungültige Option ausgewählt.");
                    break;
            }
        }
        scanner.close();
    }
}

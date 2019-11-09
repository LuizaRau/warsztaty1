package pl.coderslab.warsztaty1.zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("zadanie 1");

        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(100) + 1;

        System.out.println("wylosowano liczbe. zgadnij jaka?");

//        dodajemy while
        boolean win = false;
        int licznikProb = 0;
        while (!win) {
            licznikProb=licznikProb+1;


            int liczba = wczytajLiczbe();


            if (liczba < wylosowanaLiczba) {
                System.out.println("podana liczba jest za mala:)");
            } else if (liczba > wylosowanaLiczba) {
                System.out.println("podana liczba jest za duza");
            } else {
                System.out.println("zgadles za "+licznikProb+" razem");
                win = true;
            }

        }
    }

    public static int wczytajLiczbe() {
        System.out.println("podaj liczbe");

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("musisz podac liczbe");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

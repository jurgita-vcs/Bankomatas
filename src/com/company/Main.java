package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prisijungimas user1 = new Prisijungimas();
        Bankomat seb = new Bankomat(1000);

        int pinPatikrinimas = 0;
        int pasirinkimas = 0;
        int pinigai = 0;
        
        while (pinPatikrinimas < 3) {
            try {
                System.out.print("PIN: ");
                int pin = scanner.nextInt();
                user1.loginPin("User", pin);

                while(pasirinkimas != 5) {
                    printMenu();
                    System.out.print("Įveskite meniu pasirinkimą: ");
                    pasirinkimas = scanner.nextInt();
                    if (pasirinkimas == 1) {
                        System.out.println("Kiek norite išsiimti pinigų? ");
                        pinigai = scanner.nextInt();
                    }
                    if (pasirinkimas == 2) {
                        System.out.println("Kiek norite padeti pinigų? ");
                        pinigai = scanner.nextInt();
                    }
                    seb.menu(pasirinkimas, pinigai);
                }
            }
            catch (InvalidPinExeption e) {
                System.out.println(e.getMessage());
                pinPatikrinimas++;
            }
            if (pinPatikrinimas == 3) {
                System.out.println("Suklydote tris kartus. Jusu kortele uzblokuota.");
            }
            if (pasirinkimas == 5) {
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Paimti pinigus. Komisinis mokestis (10%)");
        System.out.println("2. Padeti pinigus. Komisinis mokestis (2%)");
        System.out.println("3. Balansas");
        System.out.println("4. Transakcijos");
        System.out.println("5. Exit");
        System.out.println("6. Valiuta");
    }

}

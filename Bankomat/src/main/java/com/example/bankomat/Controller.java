package com.example.bankomat;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.Scanner;

public class Controller {
    static MenuOptions menuOptions = new MenuOptions();
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("WŁÓŻ KARTĘ!");

        while (true) {
            System.out.print("""
                    WITAJ W M&M BANK!
                    Wybierz opcję
                    MENU:
                    1. Sprawdź saldo
                    2. Wypłata gotówki
                    3. Wpłata gotówki
                    4. Wyjście
                    """);

            int menuNumber = scanner.nextInt();
            if (menuNumber == 1) {
                menuOptions.checkAccountBalance();
                break;
            } else if (menuNumber == 2) {
                menuOptions.withdrawalCash();
//metoda 2
                break;
            } else if (menuNumber == 3) {
//metoda 3
                menuOptions.addedCash();
                break;
            } else if (menuNumber == 4) {
                System.out.println("DO ZOBACZENIA w M&M BANK!");
                System.exit(0);
            } else {
                System.out.println("Wprowadzono zły numer.");
                start();
            }


        }
        /*
        public User logIn() {
            for (int i = 1; i <= 3; i++) {
                int counter = 3;
                try {
                    System.out.println("WPROWADŹ KARTĘ ");
                    System.out.println("Wprowadź kod PIN ");
                    String PIN = scanner.next();

                    String password = scanner.next();

                } catch (NoResultException e) {
                    counter = counter - i;
                    System.out.println("Pozostao Ci prób: " + counter);
                    System.out.println("Podany PIN jest nieprawidłowy");
                }
            }
            return null;
        }*/
    }
}

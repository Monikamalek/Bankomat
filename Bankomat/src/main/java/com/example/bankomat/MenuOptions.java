package com.example.bankomat;

import java.util.Scanner;

public class MenuOptions {
    BankAccount bankAccount = new BankAccount();
    Scanner scanner = new Scanner(System.in);

   // metoda 1 saldo
   public void checkAccountBalance(){
       System.out.println("Aktualne saldo Twojego konta wynosi: " + bankAccount.accountBalance + " PLN");
   }

   // metoda 2 wypłata

    public void withdrawalCash(){
        System.out.println("""
                *** WYPŁATA GOTÓWKI ***
                Wybierz kwotę:
                1. 50 PLN
                2. 100 PLN
                3. 200 PLN
                4. 500 PLN
                5. INNA KWOTA
                """);
        int choiceSum = scanner.nextInt();
        switch (choiceSum){
            case 1:
                double withdrawalCash1 = 1;
                if (bankAccount.accountBalance < 50){
                    System.out.println("Brak wystarczających środków na koncie!");
                }else{
                    bankAccount.subtractMoney(50);
                    System.out.println("Wypłacono 50 PLN, odbierz banknoty z podajnika. Nie zapomnij zabrać karty.");
                    break;
                }
            case 2:
                double withdrawalCash2 = 2;
                if (bankAccount.accountBalance < 100){
                    System.out.println("Brak wystarczających środków na koncie!");
                }else {
                    bankAccount.subtractMoney(100);
                    System.out.println("Wypłacono 100 PLN, odbierz banknoty z podajnika. Nie zapomnij zabrać karty.");
                    break;
                }
            case 3:
                double withdrawalCash3 = 3;
                if (bankAccount.accountBalance < 200){
                    System.out.println("Brak wystarczających środków na koncie!");
                }else {
                    bankAccount.subtractMoney(200);
                    System.out.println("Wypłacono 200 PLN, odbierz banknoty z podajnika. Nie zapomnij zabrać karty.");
                    break;
                }
            case 4:
                double withdrawalCash4 = 4;
                if (bankAccount.accountBalance < 500){
                    System.out.println("Brak wystarczających środków na koncie!");
                }else {
                    bankAccount.subtractMoney(500);
                    System.out.println("Wypłacono 500 PLN, odbierz banknoty z podajnika. Nie zapomnij zabrać karty.");
                    break;
                }
            case 5:
                System.out.println("Podaj kwotę wypłaty gotówki: ");
                double differentAmount = scanner.nextDouble();
                double withdrawalCash5 = 5;
                if (bankAccount.accountBalance < differentAmount){
                    System.out.println("Brak wystarczających środków na koncie!");
                }else {
                    bankAccount.subtractMoney(differentAmount);
                    System.out.println("Wypłacono " + differentAmount + " PLN, odbierz banknoty z podajnika. Nie zapomnij zabrać karty.");
                    break;
                }


        }
    }
   // metoda 3 wpłata

    public void addedCash(){
        System.out.println("""
                *** WPŁATA GOTÓWKI ***
                Włóż pieniądze do podajnika.""");
                System.out.println("Podaj kwotę wpłaty gotówki: ");
                double addedCash = scanner.nextDouble();
                if (addedCash < 1){
                    System.out.println("Brak wpłaty!");
                }else{
                    bankAccount.subtractMoney(addedCash);
                    System.out.printf("Wypłacono " + addedCash + " PLN, odbierz banknoty z podajnika. \nNie zapomnij zabrać karty.");
                }
        }
}

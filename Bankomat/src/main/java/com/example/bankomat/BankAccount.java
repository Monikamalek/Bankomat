package com.example.bankomat;

public class BankAccount {
    public double accountBalance = 50000;  //saldo


    public void addMoney(double addedCash){    //wpłacona gotówka
        accountBalance = addedCash + accountBalance;
    }

    public void subtractMoney (double withdrawalCash){     //wypłacona gotówka
        accountBalance = accountBalance - withdrawalCash;
    }



    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountBalance=" + accountBalance +
                '}';
    }
}


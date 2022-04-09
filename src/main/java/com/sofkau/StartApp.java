package com.sofkau;


import static com.sofkau.ValueOjects.Amount.amountOf;
import static com.sofkau.ValueOjects.Date.date;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(500), date("14/01/2021"));

        account.printStatements();
    }
}

package com.sofkau;


import static com.sofkau.ValueObjects.Amount.amountOf;
import static com.sofkau.ValueObjects.Date.date;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Statement());
        Account account1 = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(500), date("14/01/2021"));

        account.transfer(account1, amountOf(500), date("12/02/2021"));

        account.printStatements();
        account1.printStatements();
    }
}

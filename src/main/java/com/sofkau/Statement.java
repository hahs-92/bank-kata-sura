package com.sofkau;


import java.time.LocalDate;

public class Statement {
    ListTransactions transactions;

    public void createTransaction(Double amount, LocalDate date, Double credit, Double debit) {
        Transaction transaction = new Transaction(date, amount, credit, debit);
        transactions.addTransaction(transaction);
    }

    public ListTransactions getTransactions() {
        return  transactions;
    }

}

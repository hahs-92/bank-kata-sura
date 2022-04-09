package com.sofkau;


import com.sofkau.ValueObjects.Amount;
import com.sofkau.ValueObjects.Date;


public class Statement {
    ListTransactions transactions;

    public Statement() {
        this.transactions = new ListTransactions();
    }

    public void createTransaction(Date date, Amount credit, Amount debit, Amount balance) {
        Transaction transaction = new Transaction(date, credit, debit, balance);
        transactions.addTransaction(transaction);
    }

    public ListTransactions getTransactions() {
        return  transactions;
    }

}

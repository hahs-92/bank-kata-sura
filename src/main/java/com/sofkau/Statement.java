package com.sofkau;


import com.sofkau.ValueOjects.Amount;
import com.sofkau.ValueOjects.Date;


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

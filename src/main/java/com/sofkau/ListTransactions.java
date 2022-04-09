package com.sofkau;

import java.util.ArrayList;
import java.util.List;

public class ListTransactions {
    List<Transaction> transactions;

    public ListTransactions() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

}

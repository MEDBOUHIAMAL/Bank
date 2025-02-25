package com.example.Bank.Printer;


import com.example.Bank.Transaction.Transaction;

import java.util.List;

public interface StatementPrinter {
    void print(List<Transaction> transactions);
}


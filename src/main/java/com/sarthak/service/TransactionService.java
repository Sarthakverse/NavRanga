package com.sarthak.service;

import com.sarthak.model.Order;
import com.sarthak.model.Seller;
import com.sarthak.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}

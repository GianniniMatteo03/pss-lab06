package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.BankAccount;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    private int transactions;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
        this.transactions = 0;
    }

    
}
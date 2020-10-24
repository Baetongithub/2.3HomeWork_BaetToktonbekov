package com.company;

public class BankAccount {
    private double amount;

    /*public BankAccount(double amount) {
        this.amount = amount;
    }*/

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return sum + amount;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum > getAmount()) {
            throw new LimitException("Not enough funds to withdraw", 0.00);
        }
        return amount - sum;
    }
}

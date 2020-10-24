package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        LimitException limitException = new LimitException("exception", bankAccount.deposit(10000.00));
        bankAccount.setAmount(bankAccount.deposit(limitException.getRemainingAmount()));
        int sum;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Еnter the amount: ");
            sum = scanner.nextInt();
            try {
                bankAccount.withDraw(sum);
                bankAccount.setAmount(limitException.getRemainingAmount() - sum);
            } catch (LimitException e) {
                // e.printStackTrace();
                System.out.println(e.getMessage());
                break;
            }
            //System.out.println(limitException.getRemainingAmount());
        }
        //}
    }
}

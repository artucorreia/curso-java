package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Account acc = new Account(1000, "Andrei", 0.0);
        BusinessAccount bacc = new BusinessAccount(
                1001,
                "Giovana",
                0.0,
                200.0
        );

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(
                1003,
                "Lais",
                0.0,
                500.0
        );
        Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;

        // ClassCastException
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
        }

         */

        /*
        Account acc = new Account(1000, "arthur", 1000.0);
        acc.withdraw(250);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "joao", 1000.0, 0.01);
        acc2.withdraw(250);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "eduardo", 1000.0, 300.0);
        acc3.withdraw(250);
        System.out.println(acc3.getBalance());

         */

        ArrayList<Account> accounts = new ArrayList<>();


        accounts.add(new SavingsAccount(1002, "joao", 1500.0, 0.01));
        accounts.add(new BusinessAccount(1003, "eduardo", 1500.0, 300.0));

        double totalBalance = 0;

        for (Account account : accounts) {
            totalBalance += account.getBalance();

        }

        System.out.println(totalBalance);

    }
}
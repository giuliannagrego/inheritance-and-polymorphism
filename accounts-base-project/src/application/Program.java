package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account(1000, "Giu", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1001, "Marcos", 4000.0, 10000.0);

        // UPCASTING

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1002, "Diogo", 0.0, 200.0);
        Account account3 = new BusinessAccount(1003, "Thiago", 0.0, 600.0);

        // DOWNCASTING

        BusinessAccount account4 = (BusinessAccount)account2;
        account4.loan(100.0);

        // BusinessAccount account5 = (BusinessAccount)account3;
        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount)account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount)account3;
            account5.updateBalance();
            System.out.println("Update!");
        }


        // Utilizando super e @Override

        Account acc1 = new Account(1234, "Rafael", 10000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1235, "Mirella", 10000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1296, "Tais", 10000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}

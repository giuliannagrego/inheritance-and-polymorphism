package application;

import entities.Individual;
import entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int empQuant = sc.nextInt();

        for(int i = 0; i < empQuant; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = Character.toLowerCase(sc.next().charAt(0));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpend = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpend));
            } else if(ch == 'c') {
                System.out.print("Number of employees: ");
                double empQuantity = sc.nextDouble();

                list.add(new Individual(name, anualIncome, empQuantity));
            }
        }

        double sum = 0.0;

        System.out.println();
        System.out.println("TAXES PAID");
        for (TaxPlayer listPlayer : list ) {
            double tax = listPlayer.tax();
            System.out.println(listPlayer.getName()  + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}

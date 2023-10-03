package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import javax.xml.crypto.Data;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        String productName;
        double productPrice, producFee;

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> productList = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productTipe =Character.toLowerCase(sc.next().charAt(0));
            System.out.print("Product name: ");
            productName = sc.next();
            System.out.print("Price: ");
            productPrice = sc.nextDouble();

            if(productTipe == 'c') {
                productList.add(new Product(productName, productPrice));
            } else if(productTipe == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date productManufactureDate = sdf.parse(sc.next());
                productList.add(new UsedProduct(productName, productPrice, productManufactureDate));
            } else if (productTipe == 'i') {
                System.out.print("Customs fee: ");
                producFee = sc.nextDouble();
                productList.add(new ImportedProduct(productName, productPrice, producFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prod : productList ) {
            System.out.println(prod.priceTag());
        }
    }
}

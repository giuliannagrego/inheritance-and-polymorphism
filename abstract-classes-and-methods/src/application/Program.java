package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for(int i = 0; i < shapes; i++ ){
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char formTipe = Character.toLowerCase(sc.next().charAt(0));
            System.out.print("What's Color (BLACK, BLUE, RED)? ");
            Color formColor = Color.valueOf(sc.next());

            if(formTipe == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(formColor, width, height));
            } else if (formTipe == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(formColor, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shapeList : list) {
            System.out.println(String.format("%.2f",shapeList.area()));
        }
    }
}

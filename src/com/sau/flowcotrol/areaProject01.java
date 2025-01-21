package com.sau.flowcotrol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areaProject01 {
    public static void main(String[] args){
        double widths, longs, bases , highs, radius;
        double areaSquare, areaTriangle, areaCircle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("+++++++++++++++++++++++");
        System.out.println(" Shap Acrea Program ");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Square Area ");
        System.out.println("2. Triangle Area ");
        System.out.println("3. Circle Area ");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Select menu");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++++++++++");
        switch (menu){
            case 1:
                System.out.print("Input widths: ");
                widths= sc.nextDouble();
                System.out.print("Input longs:");
                longs = sc.nextDouble();
                areaSquare= widths * longs;
                System.out.println("Area of Square is :" + areaSquare);
                break;
            case 2:
                System.out.print("Input bases: ");
                bases= sc.nextDouble();
                System.out.print("Input highs:");
                highs = sc.nextDouble();
                areaSquare= bases * highs /2 ;
                System.out.println("Area of Square is :" + areaTriangle);
                break;
            case 3:
                System.out.print("Input radius: ");
                radius= sc.nextDouble();
                areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Square is :" + areaCircle);
                break;
            default:
                System.out.println("Thank you...bye..bye...");
        }
        System.out.println("+++++++++++++++++++++++");
    }
}

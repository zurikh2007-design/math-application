package com.pluralsite;

public class MathApp {

    public static void main(String[] args) {
        //most
        int bobSalary = 15;
        int garySalary = 18;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is... " + highestSalary);

        //least
        int carPrice = 1200;
        int truckPrice = 1800;
        int cheapest = Math.min(truckPrice, carPrice);
        System.out.println("The cheapest price is... " + cheapest);

        //area of the circle
        double areaCircle = 3.14 * (7.15 * 2);
        System.out.println("Area of the circle is... " + areaCircle);

        //square root
        double variable = 5.0;
        double squareRoot = Math.sqrt(variable);
        System.out.println("The square root is... " + squareRoot);

        //Find distance
        int x1 = 5;
        int x2 = 10;
        int y1 = 85;
        int y2 = 50;

        int distance1 =  (y1 - x1);
        int distance2 = (y2 - x2);
        System.out.println("The distance is... " + distance1 + ", " + distance2);

        //absolute positive


    }

}

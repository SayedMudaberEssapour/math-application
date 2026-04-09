package com.pluralsight;

import java.util.Random;

public class MathApp {
    public static void main(String args[]){
        float bobSalary = 55000.567f;
        float garySalary = 670003.675f;
        float highestSalary;

        if (bobSalary > garySalary){
            highestSalary = bobSalary;
        }

        else{
            highestSalary = garySalary;
        }

        System.out.println("The highest salary between bob and gary is: $" + highestSalary);



        // 2

        float carPrice = 50000.60f;
        float truckPrice = 656434.989f;

        float smallestPrice;

        if (carPrice < truckPrice){
            smallestPrice = carPrice;
        }

        else{
            smallestPrice = truckPrice;
        }

        System.out.println("The smallest price between the two vehicles is: $"+ smallestPrice);



        //3 area of a circle

        float pi = 3.14f;
        float radius = 7.25f;

        double areaOfCircle = (pi * (Math.pow(radius, 2)));

        System.out.println("The area of the cirlc is: " + areaOfCircle);




        //4 square root of a number

        double num = 5.0;
        double squareRoot = Math.sqrt(num);

        System.out.println("The square root of 5.0 is: " + squareRoot);



        // 5 distance between points

        int num1 = 5;
        int num2 = 10;
        int num3 = 85;
        int num4 = 50;

        int distanceBetween1And2 = (num2 - num1);
        int distanceBetween3and4 = (num3 - num4);

        System.out.println("Distance between num1 and num2 is: " + distanceBetween1And2);
        System.out.println("Distance between num3 and num4 is: " + distanceBetween3and4);



        //6 absolute positve of a number


        double number = -3.8;
        double absVal;

        if (number < 0){
            absVal = number * -1;
            System.out.println("The absolute value of " + number + " is " + absVal);
        }


        //7 printing random number

        Random rand = new Random();
        int RandomNum = rand.nextInt(2);
        System.out.println("Random number between 0 and 1: " + RandomNum);












    }
}

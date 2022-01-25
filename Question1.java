package com.company;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        float floatValue = input.nextFloat();

        double area = floatValue * floatValue * PI;
        System.out.println("The area for the circle of radius "+ floatValue + " is " + area);
    }
}

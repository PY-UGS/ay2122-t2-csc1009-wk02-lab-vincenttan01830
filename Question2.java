package com.company;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        float avg = 0;
        float[] array = new float[3];

        System.out.print("Enter three numbers: ");
        for(int i = 0; i < 3; i++){
            array[i] = input.nextFloat();
            sum += array[i];
        }
        avg = sum / 3;

        System.out.print("The average of " + array[0] + " " + array[1] + " " + array[2] + " is " + avg);
    }
}

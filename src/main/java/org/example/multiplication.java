package org.example;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Integer");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Integer");
        int num2 = sc.nextInt();

        int product = 0;

        for(int i= 0; i<num1; i++){
            product = product + num2;
        }

        System.out.println("multiplication of 2 numbers is " + product);
    }
}
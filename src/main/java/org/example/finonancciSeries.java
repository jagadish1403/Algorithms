package org.example;

import java.util.Scanner;

public class finonancciSeries {

    public static void main(String[] args){

      System.out.println("enter a number to print the fibonanci series");
      Scanner sc = new Scanner(System.in);
      int fibo = sc.nextInt();

      int[] num = new int[fibo];
      num[0] = 0;
      num[1] = 1;

      for(int i=2; i<fibo; i++){
          num[i] = num[i-1]+num[i-2];
        }

      for(int i=0; i<fibo; i++){
          System.out.print(num[i]);
      }



    }
}

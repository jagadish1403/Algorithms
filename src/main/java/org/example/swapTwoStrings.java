package org.example;

public class swapTwoStrings {

    public static void main(String[] args){

      String s1 = "Rahul";
      String s2 = "Shetty";

      s1 = s1+s2;

      System.out.println("s1 String is "+ s1);
        System.out.println("s2 String is "+ s2);

        s2 = s1.substring(0, s1.length()-s2.length());

        System.out.println("s2 String is "+ s2);

        s1 = s1.substring(s2.length());

        System.out.println("s1 String is "+ s1);



    }
}

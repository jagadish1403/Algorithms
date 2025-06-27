package org.example;

public class reverseOfString {

    public static void main(String[] args){
       String str = "liril";

       System.out.println("Using For Loop \n");
       System.out.println("reverse of a string is " );

       for(int i=str.length()-1; i>=0; i--){
           System.out.print(str.charAt(i));
       }

       StringBuilder sb = new StringBuilder(str);
       sb.reverse();
       System.out.println("\nusing the existing built in methods");
       System.out.println(sb);
    }
}

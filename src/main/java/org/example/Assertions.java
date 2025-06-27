package org.example;

public class Assertions {

    public static void main(String[] args){

        String str = "lirila";
        String outputString = "";

        for(int i=str.length()-1; i>=0; i--){
            outputString = outputString+str.charAt(i);
        }

        System.out.println("reverse of a string is" + outputString);







    }


}

package org.example;

public class toggleChars {

    public static void main(String[] args){
        String str = "Hello&*9wOrld";
        StringBuilder result = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(char c : charArray){
            if(Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else if(Character.isLowerCase(c))
                result.append(Character.toUpperCase(c));
            else if(!Character.isAlphabetic(c))
                result.append(c);
        }

        System.out.print(result);
    }
}

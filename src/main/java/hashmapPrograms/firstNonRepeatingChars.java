package hashmapPrograms;

import java.util.HashMap;

public class firstNonRepeatingChars {

    public static void main(String[] args){

     String str = "adefgah";

        HashMap<Integer, Character> str1 = new HashMap<Integer, Character>();

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()-1; j++){

               if(str.charAt(i) == str.charAt(j)){
                   continue;
               }
               else {
                   
               }

            }
        }
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class occurancesOfString {

    public static void main(String[] args) {
        String str = "Alice is girl and girl is boy";

        HashMap<String, Integer> map1 = new HashMap<>();

        String[] words = str.split(" ");

        for(String word : words){
            Integer occur =   map1.get(word);

            if(map1.containsKey(word))
                map1.put(word, occur+1);
            else
                map1.put(word, 1);
        }

        System.out.println("Strings and its corresponding values are\n");
        for(Map.Entry<String, Integer> map2 : map1.entrySet()){
            System.out.println(map2.getKey() + " " + map2.getValue());
        }

        System.out.println("Removing the duplicates \n");
        for(Map.Entry<String, Integer> map3 : map1.entrySet()){
            if(map3.getValue() == 1)
                System.out.println(map3.getKey() + "  " + map3.getValue());
        }


    }
}

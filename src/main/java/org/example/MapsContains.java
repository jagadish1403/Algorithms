package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsContains {

    public static void main(String[] args){

//        ArrayList<String> str = new ArrayList<>();
//
//        str.add("sandhya");
        String str = "sasnddhya";
        HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
//        str.add("mallesh");
//        str.add("sandy");
//
//        System.out.print(str.contains("sandhya"));
//
//        HashMap<Integer, String> strMap = new HashMap<Integer, String>();
//        strMap.put(1, "sandhya");
//        strMap.put(2, "mallesh");
//        strMap.put(3, "sandy");
//
//        System.out.print(strMap.containsValue("sandhya"));

        for(Character ch : str.toCharArray()){
            if(strMap.containsKey(ch)){
                int value = strMap.get(ch);
                value = value+1;
                strMap.put(ch, value);

            }else {
                strMap.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> hash1 : strMap.entrySet()){
            if(hash1.getValue() > 1){
                maxValue = hash1.getValue();
                maxKey = String.valueOf(hash1.getKey());
                System.out.println("duplicate character is "+ maxKey + " no of times repeated is "+ maxValue);
            }
        }

       // System.out.print("Repeated Character is "+ maxKey + "Repeated Value is "+ maxValue);
    }
}

package HashMapCollections.naveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashmapBasics {

    public static void main(String[] args){

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "NewDelhi");
        capitalMap.put("USA", "Washington");
        capitalMap.put("UK", "London");

        for(Map.Entry<String, String> a :capitalMap.entrySet()){
           System.out.println(a.getValue());
            System.out.println(a.getKey());
        }




    }



}

package collections.naveen;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicates {

    public static void main(String[] args){

     ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4,5,6,8,9));

     //linkedHashSet
        HashSet<Integer> linkedintSet = new HashSet<>(intArray);

        for(Integer values : linkedintSet){
            System.out.print(values);
        }

        List<Integer> removeArray = intArray.stream().distinct().collect(Collectors.toList());
        System.out.print(removeArray);



    }
}

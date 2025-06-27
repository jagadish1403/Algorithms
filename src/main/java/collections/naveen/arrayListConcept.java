package collections.naveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrayListConcept {

    public static void main(String[] args){

       ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,0,2,0,3,4,0,5,6,7,8,9,10, -9, -8, 0));

//       ar.removeIf(num -> num%2==1);
//       System.out.println("even numbers are +"+ ar);
//
//       System.out.print(ar.stream().collect(Collectors.counting()));

//        System.out.println(Stream.concat(ar.stream().filter(n->n!=0), ar.stream().filter(n->n==0)).collect(Collectors.toList()));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        }



    }


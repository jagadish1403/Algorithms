package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.sort;

public class maxTripletofAnArray {
    int highIndex = 0;
    int secondIndex = 0;
    int thirdIndex = 0;

    ArrayList<Integer> negative = new ArrayList<>();
    ArrayList<Integer> positive = new ArrayList<>();


    public  int calculateTriplet(ArrayList<Integer> arr) {
        sort(arr);
        highIndex = arr.get(arr.size()-1);

        for (Integer i : arr) {
            if (i < 0)
                negative.add(i);
            else
                positive.add(i);
        }

        for (Integer j : negative) {
            if (Math.abs(j) > highIndex) {
                secondIndex = j;
                negative.remove(j);
                break;
            }
        }
        if(secondIndex==0)
            secondIndex = positive.get(positive.size()-2);


        for (Integer j : negative) {
            if (Math.abs(j) > secondIndex && negative.size()%2==0) {
                thirdIndex = j;
                break;
            }
        }
        if(thirdIndex==0)
            thirdIndex = positive.get(positive.size()-3);


        return highIndex*secondIndex*thirdIndex;
    }



    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(-20, -30, 5, 1, 30));
        maxTripletofAnArray a = new maxTripletofAnArray();
       System.out.println(a.calculateTriplet(arr));
    }
}

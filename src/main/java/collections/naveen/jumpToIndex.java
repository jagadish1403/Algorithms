package collections.naveen;

import java.util.ArrayList;
import java.util.Arrays;

public class jumpToIndex {

    public static void main(String[] args){

        ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,2,3,-3,4,5,8,9,0));

        int startJump = 0;
        int startIndex = 0;

        do{
          int num = ar1.get(startIndex);

          if(num>0) {
              startJump = ar1.get(startIndex + num) ;
              startIndex = startIndex + num;
              System.out.println(startJump);
          }else{
              startJump= ar1.get(startIndex-Math.abs(num));
              startIndex = startIndex-Math.abs(num);
              System.out.println(startJump);

          }
        }while(startIndex<=ar1.size());
    }

}

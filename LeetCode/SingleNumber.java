package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {
    public static int singleNumber(int[] nums){

        HashMap<Integer, Integer> theNumbers = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            Integer currNum = nums[i];
            Integer num;
            if (theNumbers.containsKey(currNum)) {
                num = theNumbers.get(currNum);
                theNumbers.put(currNum, num + 1);
            } else {

                theNumbers.put(currNum, 1);
            }
        }


        Integer theVal = 0;

        for (Integer val : theNumbers.keySet()){
            if (theNumbers.get(val) == 1){
                theVal = val;
            }
        }
        return theVal;
    }
    public static void main(String[] args) {
            int nums[] = {4,1,2,1,2};
            int number = singleNumber(nums);
        System.out.println(number);

        HashSet<Integer> set = new HashSet<>();
        set.add(0);


    }
}

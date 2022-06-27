package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int[] arr = new int[2];

        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 12};
        int[] arr2 = twoSumTest(arr, 5);

        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

    public static int[] twoSumTest(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("Number not found");
    }

}

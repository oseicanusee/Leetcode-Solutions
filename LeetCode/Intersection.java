package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        //  int[] ray1 = {4,9,5}; 4,5,9
        //  int[] ray2 = {9,4,9,8,4}; 4,4,8,9,9
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 1; i < nums1.length; i++){
                if (nums1[i] != nums1[l]){
                    l++;
                    nums1[l] = nums1[i];
                }
        }
        l = 0;
        for (int i = 1; i < nums2.length; i++){
            if (nums2[i] != nums2[l]){
                l++;
                nums2[l] = nums2[i];
            }
        }

        int count = 0;

        for (int i = 0; i < nums1.length; i++){
           if (map.containsKey(nums1[i])){
               int val = map.get(nums1[i]);
               val++;
               map.put(nums1[i], val);
               count++;
           } else {
               map.put(nums1[i], 1);
           }
        }

        for (int i = 0; i < nums2.length; i++){
            if (map.containsKey(nums2[i])){
                int val = map.get(nums2[i]);
                val++;
                map.put(nums2[i], val);
                count++;
            } else {
                map.put(nums2[i], 1);
            }
        }

        int[] merged = new int[count];
            int curr = 0;

        for (int num : map.keySet()){
            if (map.get(num) > 1){
                merged[curr] = num;
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] ray1 = {4,9,5};
        int[] ray2 = {9,4,9,8,4};

        int[] merged = intersection(ray1, ray2);

        for(int i = 0; i < merged.length; i++){
            System.out.print(merged[i] + " ");
        }


    }

}

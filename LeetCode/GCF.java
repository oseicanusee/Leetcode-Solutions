package LeetCode;

public class GCF {

    public static int findGCD(int[] nums){
        int largest = nums[0], smallest = nums[0];

        for (int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }

            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }

        int gcd = 0;
        while(smallest != largest){
            if (smallest > largest){
                smallest -= largest;
            }
            else {
                largest -= smallest;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

    }
}

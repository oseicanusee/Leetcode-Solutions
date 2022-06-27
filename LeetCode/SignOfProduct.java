package LeetCode;

public class SignOfProduct {

    public static int arraySign(int[] nums){
        long product = 1;

        for (int i : nums){
            if (i == 0){
                return 0;
            }

            product*= i;
        }

        return signFunc(product);
    }

    public static int signFunc(long x){
        if (x > 0){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};

        System.out.println(arraySign(nums));
    }
}

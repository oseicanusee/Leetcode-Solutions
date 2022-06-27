package LeetCode;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        boolean isPower = false;

        for (int i = 0; i < n; i++){
            if (Math.pow(2, i) == n){
                isPower = true;
                break;
            }
        }
        return isPower;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}

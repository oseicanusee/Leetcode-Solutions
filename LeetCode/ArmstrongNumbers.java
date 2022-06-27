package LeetCode;

public class ArmstrongNumbers {
    public static boolean isArmstrong(int x){
        int num = x, reverse = 0, remainder = 0;
        boolean isArmstrong = false;

        while (num !=0){
            remainder = num % 10;
            reverse += Math.pow(remainder, 3);
            num = num / 10;
        }

        if (reverse == x){
            isArmstrong = true;
        }

        return isArmstrong;
    }
    public static void main(String[] args) {
        boolean isArmstrong = isArmstrong(371);
        System.out.println(isArmstrong);
    }
}

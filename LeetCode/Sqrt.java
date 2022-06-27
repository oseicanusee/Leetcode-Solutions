package LeetCode;

public class Sqrt {

    public static void main(String[] args) {
        int x = 4;

        int count = 0, i = 1;

        while (x - i >= 0){
            count++;

            x -= i;
            i+=2;
        }

        System.out.println(count);
    }
}

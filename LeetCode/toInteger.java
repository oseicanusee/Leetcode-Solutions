package LeetCode;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class toInteger {
    public static int romanToInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int right = (s.length() - 1);
        int total = 0;
        total += roman.get(s.charAt(right));

        for (int left = s.length() - 2; left >= 0; left--){
            int leftVal = roman.get(s.charAt(left));
            int rightVal = roman.get(s.charAt(right));

            if (leftVal < rightVal){
                total -= leftVal;
            } else{
                total+= leftVal;
            }
            right--;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMLXXXIV"));
    }
    }


package LeetCode;

import java.util.ArrayList;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs){

        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"flowers", "flow", "flight"};



        String prefix = strs[0];

        String word = strs[1];

        while(word.indexOf(prefix) != 0){
            prefix = prefix.substring(0, prefix.length() - 1);
        }

        System.out.println(prefix);


    }
}

package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String s){

        int n = s.length();

        LinkedHashMap<Character,Integer> letters = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){

            if (letters.containsKey(s.charAt(i))){
                letters.put(s.charAt(i), -1);
            } else {
                letters.put(s.charAt(i), i);
            }
        }

        for (char letter : letters.keySet()){

            if (letters.get(letter) >= 0){
                return letters.get(letter);
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        String s = "loveleetcode";
        System.out.println(firstUniqueChar(s));
    }
}

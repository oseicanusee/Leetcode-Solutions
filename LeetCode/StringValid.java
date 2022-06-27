package LeetCode;

import java.util.HashMap;

public class StringValid {
    public static boolean isValid(String s) {
        HashMap<Character, Character> characterCharacterHashMap = new HashMap<>();
        characterCharacterHashMap.put('(', ')');
        characterCharacterHashMap.put('{', '}');
        characterCharacterHashMap.put('[', ']');
        boolean isValid = false;
        char curr;
        // "()[]{}"
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {
                curr = s.charAt(j);
                  if (curr == characterCharacterHashMap.get(s.charAt(i))){
                      isValid = true;
                     s = s.substring(i, j);
                      continue;
                  }
                }
            }
        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));

    }
}

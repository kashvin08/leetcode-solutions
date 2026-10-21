import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

       return Arrays.equals(chars, chars2);
    }
}

public class ValidAnagram {
    public static void main() {
        String s = "anagram";
        String t = "nagaram";

        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}
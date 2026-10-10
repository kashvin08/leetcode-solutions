import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');//([])

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(([]})";
        Solution solution = new Solution();
        boolean ans = solution.isValid(s);
        System.out.println(ans);
    }
}
import java.util.*;

class Solution{
    public int romanToInt(String s){
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int currVal = roman.get(s.charAt(i));

            if(i+1 < s.length()){
                int nextVal = roman.get(s.charAt(i+1));

                if(currVal < nextVal){
                    total -= currVal;
                }else{
                    total += currVal;
                }

            } else {
                total += currVal;
            }

        }
        return total;
    }
}

public class RomanToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a roman number: ");
        String s = scanner.nextLine();
        Solution sol = new Solution();
        int ans = sol.romanToInt(s);
        System.out.println(ans);
    }
}
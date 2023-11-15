import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && stack.isEmpty()) {
                continue;
            } else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
            }
        }
//        System.out.println(stack);
        if (!stack.isEmpty() || s.length()%2!=0) {
            answer = false;
        }
     

        return answer;
    }
}
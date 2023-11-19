import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numberStr = String.valueOf(n);
        int len = numberStr.length();
        for (int i = 0; i < len; i++) {
            String s = "";
            s += numberStr.charAt(i);
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
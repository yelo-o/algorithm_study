import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for (int i : indices) {
            list.add(i);
        }
        for (int i=0; i<my_string.length(); i++) { //i가 indices에 포함되지 않는 숫자면 추가
            if (!list.contains(i)) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}
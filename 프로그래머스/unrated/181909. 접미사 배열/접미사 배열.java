import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(list);
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
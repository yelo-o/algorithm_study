import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
//        System.out.println(tmp);
        String[] split = myStr.split("a|b|c");
//        System.out.println(split.length);
        String[] answer = {};
        for (String s : split) {
            if (!s.isEmpty()) {
                list.add(s);
            } else {

            }
        }
        if (list.isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = list.toArray(new String[0]);
        }
        
        return answer;
    }
}
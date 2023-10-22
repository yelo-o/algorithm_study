import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        String[] split = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for (int i=0; i< split.length; i++) {
            if(!split[i].isBlank()) {
                list.add(split[i]);
            }
        }
        String[] answer = new String[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}
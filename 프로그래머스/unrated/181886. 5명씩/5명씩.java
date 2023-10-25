import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        //String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i=0; 5*i<names.length; i++) {
//            System.out.println(i);
            list.add(names[5*i]);
//            i++;
            System.out.println(5*i);
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
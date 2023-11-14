import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splits = s.split(" ");
        int[] numbers = new int[splits.length];
        List<Integer> list = new ArrayList<>();
        for (String split : splits) {
            list.add(Integer.parseInt(split));
        }
        Collections.sort(list);
        answer += list.get(0) + " " + list.get(list.size()-1);
        System.out.println(answer);
        return answer;
    }
}
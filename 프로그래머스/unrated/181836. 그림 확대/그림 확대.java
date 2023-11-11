import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k]; //size of answer array is always three times bigger than picture array
        int len = answer.length; //9
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            for (int j = 0; j < picture[0].length(); j++) {
                for (int c = 0; c < k; c++) { //각 글자를 3번 반복
                    tmp += picture[i].charAt(j);
                }
            }
            list.add(tmp);
        }
//        System.out.println(list);
        for (int i = 0; i < len; i++) {
            answer[i] = list.get(i/k);
        }
        return answer;
    }
}
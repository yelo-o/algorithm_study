import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        //participant의 이름이 몇 명 있었는지 확인
        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        //completion 누구누구 있는지 확인
        for (String key : completion) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }
        //map에서 값이 0이 아닌 key 호출
        for (String key : participant) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
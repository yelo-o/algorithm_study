import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i].length());
        }

        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        // System.out.println(map);
        map.forEach((key, value) -> list2.add(value));
        for (int i : list2) {
            if (answer < i) {
                answer = i;
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        System.out.println(map);
        System.out.println(list);
        list.clear();

        //value가 가장 큰 값 찾기
        Set<Integer> set = map.keySet();
        System.out.println(set);
        int max = 0;
        for (int s : set) {
            list.add(map.get(s));
            if (max < map.get(s)) {
                max = map.get(s);
                answer = s;
            }
        }
        System.out.println("answer : " + answer);

        System.out.println(list);
        //중복되는게 있는지 없는지만 체크
        int cnt = 0;
        for (int i : list) {
            if (i == max) {
                cnt++;
            }
        }
        if (cnt > 1) {
            answer = -1;
        }
        return answer;
    }
}
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int len = rank.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        //map(등수, 번호)
        for (int i = 0; i < len; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
//                list.add(rank[i]);
            }
        }
//        System.out.println(map);
        Set<Integer> rankSet = map.keySet();
        List<Integer> collect = rankSet.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
//        System.out.println(collect);

        int a = map.get(collect.get(0));
        int b = map.get(collect.get(1));
        int c = map.get(collect.get(2));

        answer = 10000 * a + 100 * b + c;
        return answer;
    }
}
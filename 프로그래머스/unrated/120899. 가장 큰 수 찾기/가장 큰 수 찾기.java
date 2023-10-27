import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        // int[] answer = {};
        // int[] array = {1, 8, 3};
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i :array) {
            list.add(i);
            list2.add(i);
        }

        Collections.sort(list);
        answer[0] = list.get( list.size() - 1 );
        System.out.println(list);
        int index = list2.indexOf(answer[0]);
        answer[1] = index;
        return answer;
    }
}
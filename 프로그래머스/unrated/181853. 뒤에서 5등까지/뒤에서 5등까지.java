import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        //int[] answer = {};
        IntStream sorted = Arrays.stream(num_list).sorted();
        List<Integer> smallList = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();
        for (int i : sorted.toArray()) {
            smallList.add(i);
        }
        for (int i=0;  i<5; i++) {
            ansList.add(smallList.get(i));
        }
        System.out.println(ansList);
        Integer[] ans = ansList.toArray(new Integer[0]);
        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
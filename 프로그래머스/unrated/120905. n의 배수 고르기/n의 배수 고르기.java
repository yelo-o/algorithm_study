import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i%n == 0) {
                list.add(i);
            }
        }
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
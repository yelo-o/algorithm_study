import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for (int i=intervals[0][0]; i<=intervals[0][1]; i++) {
            list.add(arr[i]);
        }
        for (int i=intervals[1][0]; i<=intervals[1][1]; i++) {
            list.add(arr[i]);
        }
        // System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int answer[] = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
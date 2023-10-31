import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else if (flag[i] == false) {
                for (int j = 1; j <= arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        // System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
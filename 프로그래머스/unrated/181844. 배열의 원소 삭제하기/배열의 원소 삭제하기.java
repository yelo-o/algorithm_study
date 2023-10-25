import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> deletedList = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : delete_list) {
            deletedList.add(i);
        }
        for (int i : arr) {
            if (!deletedList.contains(i)) {
                set.add(i);
            }
        }
        //Integer[] answer = set.toArray(new Integer[0]);
        Integer[] ans = set.toArray(new Integer[0]);
        
        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
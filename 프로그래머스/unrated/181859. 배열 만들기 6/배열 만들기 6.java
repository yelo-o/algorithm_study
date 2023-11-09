import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        List<Integer> stk = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size()-1) ==arr[i]) {
                stk.remove(stk.size() - 1);
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
            }
        }
        
        if (stk.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = stk.stream()
                    .mapToInt(i -> i)
                    .toArray();
        }
        return answer;
    }
}
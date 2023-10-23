import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list, int n) {
        //int[] answer = {};
        int len = num_list.length;
        int[] answer = new int[len - n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i=n-1; i<len; i++) {
            list.add(num_list[i]);
        }
        
        for (int i=0; i<len - n + 1; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
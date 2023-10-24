import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        //int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            int a = 0;
            while(a < arr[i]) {
                list.add(arr[i]);
                a++;
            }
        }
        int[] answer = new int[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}
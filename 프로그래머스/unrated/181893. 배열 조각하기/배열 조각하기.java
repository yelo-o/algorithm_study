import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            list.add(i);
        }

        for (int i=0; i<query.length; i++) {
            if (i%2 == 0) {
                int len = list.size();
                for (int j=query[i]+1; j<len; j++) { //5
                    list.remove(list.size()-1);
                    // System.out.println(list);
                }
            } else {
                for (int j=0; j<query[i]; j++) { //0
                    list.remove(0);
                    // System.out.println(list);
                }
            }
        }
        
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
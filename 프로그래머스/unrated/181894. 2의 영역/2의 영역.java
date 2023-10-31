import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // int[] answer = {};
        List<Integer> indexList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                indexList.add(i);
            }
        }
        if (indexList.isEmpty()) {
            list.add(-1);
        } else {
            int end = indexList.get(indexList.size() - 1);
            int start = indexList.get(0);
    
            for (int i=start; i<=end; i++) {
                list.add(arr[i]);
            }
        }

        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
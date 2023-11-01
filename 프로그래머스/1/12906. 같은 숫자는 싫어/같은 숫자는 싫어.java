import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // int[] answer = {};
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int size = list.size();
            if (size == 0) {
                list.add(arr[i]);
            } else {
                if (list.get(size - 1) != arr[i]) {
                    list.add(arr[i]);
                }
            }
        }
        
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
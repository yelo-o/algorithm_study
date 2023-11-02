import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // int[] answer = {};
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i=0; i<commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=commands[i][0] - 1; j<commands[i][1]; j++) {
                list.add(array[j]);
//                System.out.println(list);
            }
            Collections.sort(list);
            numberList.add(list.get(commands[i][2]-1));
        }
        // System.out.println(numberList);
        int[] answer = Arrays.stream(numberList.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
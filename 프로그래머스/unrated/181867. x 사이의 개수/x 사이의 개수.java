import java.util.*;
class Solution {
    public int[] solution(String myString) {
        // int[] answer = {};
        String[] split = myString.split("x"); //[1, 2, 1, 0, 1, 0]
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println(split.length); 
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<split.length; i++) {
            list.add(split[i].length());
        }
        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }
        System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (String intStr : intStrs) {
            String str = "";
            for (int i=0; i<intStr.length(); i++) {
                if (i>=s && i<=(s + l - 1) ) {
                    str += intStr.charAt(i);
                }
            }
            list.add(str);
        }
        for (String str : list) {
            if (Integer.parseInt(str) > k) {
                list2.add(Integer.parseInt(str));
            }
        }
        System.out.println(list2);
        Integer[] array = list2.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
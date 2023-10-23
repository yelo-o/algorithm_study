import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        //int[] stk = {};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) { //i가 arr의 크기보다 작으면
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.get(list.size() - 1));
            }
        }
        for (int l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
        int[] stk = new int[list.size()];
        for (int j=0; j< list.size(); j++) {
            stk[j] = list.get(j);
        }
        for (int s : stk) {
            System.out.print(s + " ");
        }
        return stk;
    }
}
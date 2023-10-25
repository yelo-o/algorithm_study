import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        //int[] answer = {};
        List<Integer> head = new ArrayList<>();
        List<Integer> tail = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<num_list.length; i++) {
            if (i<n) {
                head.add(num_list[i]);
            } else {
                tail.add(num_list[i]);
            }
        }
        System.out.println(head);
        System.out.println(tail);
        int[] answer = new int[head.size() + tail.size()];
        for (int i=0; i<tail.size(); i++) {
            ans.add(tail.get(i));
        }
        for (int i=0; i<head.size(); i++) {
            ans.add(head.get(i));
        }
        for (int i=0; i<answer.length; i++) {
            answer[i] = ans.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }
}
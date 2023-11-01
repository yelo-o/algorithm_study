import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        System.out.println(max);
        Set<Object> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        System.out.println(set);
        if (set.size() > max) {
            answer = max;
        } else {
            answer = set.size();
        }
        return answer;
    }
}
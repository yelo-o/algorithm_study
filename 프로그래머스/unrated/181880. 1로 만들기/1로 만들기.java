class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i=0; i<num_list.length; i++) {
            int no = num_list[i];
            while (no > 1) {
                if (no%2 == 0) { //no is even
                    no /= 2;
                } else if (no%2 != 0) { //no is odd
                    no = (no - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}
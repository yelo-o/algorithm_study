class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = false;
        while (!flag) {
            for (int i = 1; i < n; i++) {
                if (n % i == 1) {
                    answer = i;
                    break;
                }
            }
            flag = true;
        }
        return answer;
    }
}
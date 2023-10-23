class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int len = numbers.length;
        for (int i=0; i<len; i ++) {
            if (answer <= n) {
                answer += numbers[i];
            }
        }
        return answer;
    }
}
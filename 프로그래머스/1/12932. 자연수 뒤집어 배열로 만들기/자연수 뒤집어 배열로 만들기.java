class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String s = String.valueOf(n);
        int len = s.length();
        answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = s.charAt(len - i - 1) -48;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n) {
        int len = (int) (Math.ceil(n / 2.0));
        int[] answer = new int[len];
        
        for (int i=0; i<len; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
    }
}
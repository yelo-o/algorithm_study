class Solution {
    public int[] solution(int start, int end_num) {
        //int[] answer = {};
        int gap = start - end_num + 1; //8

        int[] answer = new int[gap];
        for (int i=0; i<gap; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}
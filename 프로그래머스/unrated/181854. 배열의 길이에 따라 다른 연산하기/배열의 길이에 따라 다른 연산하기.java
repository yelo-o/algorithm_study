class Solution {
    public int[] solution(int[] arr, int n) {
        // int[] answer = {};
        int len = arr.length;
        int[] answer = new int[len];

        for (int i=0; i<len; i++) {
            if(len%2 != 0) { //홀수
                if(i%2 == 0) {
                    arr[i] = arr[i] + n;
                }
            } else {
                if(i%2 != 0) {
                    arr[i] = arr[i] + n;
                }
            }
        }
        for (int i=0; i< answer.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;

        int num = 0;
        while (len > (int) Math.pow(2, num)) {
            num++;
        }
        int actualLen = (int) Math.pow(2, num);
        System.out.println(actualLen);
        answer = new int[actualLen];
        for (int i = 0; i < actualLen; i++) {
            if (i < len) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}
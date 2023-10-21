class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        for (int i=0; i<len; i++) {
            int tmp = 0;
            for(int j=i+1; j<len;j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        answer = array[len/2];
        return answer;
    }
}
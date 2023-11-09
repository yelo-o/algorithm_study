import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k]; //answer 배열의 크기는 k
        int[] array = Arrays.stream(arr)
                            .distinct()
                            .toArray();

        int distinctLen = array.length;
        // System.out.println("distinctLen : "+ distinctLen + ", k : " + k);

        if (distinctLen < k) {
            for (int i = 0; i < distinctLen; i++) {
                answer[i] = array[i];
            }
            for (int i = distinctLen; i < k; i++) {
                answer[i] = -1;
            }

        } else { //distinctLen >= k
            for (int i = 0; i < k; i++) {
                answer[i] = array[i];
            }
        }
        return answer;
    }
}
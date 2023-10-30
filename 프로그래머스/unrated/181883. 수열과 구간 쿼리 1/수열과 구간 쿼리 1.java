class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int i=0; i<queries.length; i++) { //0, 1, 2
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                arr[j]++;
            }
        }
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
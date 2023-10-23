class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int a : arr1) {
            sum1 += a;
        }
        for(int a : arr2) {
            sum2 += a;
        }
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length) {
            if (sum1 > sum2) {
                answer = 1;
            } else if (sum1 < sum2){
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}
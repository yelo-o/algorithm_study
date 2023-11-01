class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        //arr의 원소들이 변하지 않는 시점까지 반복
        int cnt =0;
        while(cnt < arr.length) {
            cnt = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]%2==0 && arr[i]>=50) { //원소의 값이 50보다 크거나 같은 짝수 -> 나누기 2
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[i] / 2;
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                } else if (arr[i]%2!=0 && arr[i]<50) { //원소의 값이 50보다 작은 홀수 -> 곱하기 2 + 1
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[i] * 2 + 1;
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                } else {
                    int tmp = 0;
                    tmp = arr[i];
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                }
            }
            answer++;
        }
        return answer;
    }
}
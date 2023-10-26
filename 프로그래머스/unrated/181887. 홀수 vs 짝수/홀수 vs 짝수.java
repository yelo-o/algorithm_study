class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumOdd = 0, sumEven = 0;
        for (int i=0; i< num_list.length; i++) {
            if(i%2 == 0) { //홀수번째 일떄
                sumOdd += num_list[i];
            } else {
                sumEven += num_list[i];
            }
        }
        if (sumOdd > sumEven) {
            answer = sumOdd;
        } else if (sumOdd < sumEven) {
            answer = sumEven;
        } else {
            answer = sumOdd;
        }
        return answer;
    }
}
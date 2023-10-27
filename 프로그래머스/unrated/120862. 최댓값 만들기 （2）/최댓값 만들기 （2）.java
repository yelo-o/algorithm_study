class Solution {
    public int solution(int[] numbers) {
        // int answer = 0;
        int maxValue = Integer.MAX_VALUE * -1;
        int answer = 0;
        int mul = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                mul = numbers[i] * numbers[j];
                if (mul > answer) {
                    answer = mul;
                }
            }
        }
        int mul2 = 0;
        if (answer == 0){
            for (int i=0; i<numbers.length; i++) {
                for (int j=i+1; j<numbers.length; j++) {
                    mul2 = numbers[i] * numbers[j];
                    if (mul2>maxValue) {
                        maxValue = mul2;
                    }
                }
            }
            answer = maxValue;
        }
        return answer;
    }
}
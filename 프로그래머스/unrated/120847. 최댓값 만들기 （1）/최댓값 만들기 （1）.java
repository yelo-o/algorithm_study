class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        for (int i=0; i<len; i++) {
            for (int j=i+1; j<len; j++) {
                int tmp = 0;
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
            
        answer = numbers[len-1] * numbers[len-2];
        return answer;
    }
}
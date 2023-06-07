class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = (double)num1/(double)num2;
        double answer0 = result * 1000;
        answer = (int)answer0;
        return answer;
    }
}
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n);
        System.out.println(x);
        for (int i = 0; i < 7071067; i++) {
            if (i == Math.sqrt(n)) {
                answer = (long) Math.pow((long) x + 1, 2);
                break;
            }
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}
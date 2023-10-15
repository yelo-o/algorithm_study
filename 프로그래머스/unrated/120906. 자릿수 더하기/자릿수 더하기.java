import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int len = (int) Math.log10(n) + 1;
        System.out.println("자릿수 : " + len);
        while(n>0) {
            answer += n%10;
            n /= 10;
        }
        
        return answer;
    }
}
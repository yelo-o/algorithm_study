import java.lang.Math;
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = (int) Math.ceil(n/(float)slice);
        return answer;
    }
}
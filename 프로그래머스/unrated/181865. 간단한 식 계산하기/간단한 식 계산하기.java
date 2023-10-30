class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        if (binomial.contains("+")) {
            answer = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
        } else if (binomial.contains("-")) {
            answer = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
        } else {
            answer = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        }
        return answer;
    }
}
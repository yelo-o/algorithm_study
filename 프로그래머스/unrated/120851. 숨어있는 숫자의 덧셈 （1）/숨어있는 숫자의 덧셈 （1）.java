class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        for (int i=0; i<len; i++) {
            if ((int) (my_string.charAt(i)) < 65 ) {
                answer += (int) (my_string.charAt(i)) - 48;
            }
        }
        return answer;
    }
}
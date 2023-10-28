class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if (i>=s && i<=(e)) { //6,7,8
                answer += my_string.charAt(e + s - i);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
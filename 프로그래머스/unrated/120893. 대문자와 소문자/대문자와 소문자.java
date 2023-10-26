class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) < 97) { //대문자이면
                String s = "";
                s += my_string.charAt(i);
                String low = s.toLowerCase();
                answer += low;
            } else {
                String s = "";
                s += my_string.charAt(i);
                String high = s.toUpperCase();
                answer += high;
            }
        }
        return answer;
    }
}
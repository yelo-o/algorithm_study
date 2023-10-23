class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        int len = my_string.length();

        for (int i=0; i<len; i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer += alp.toUpperCase();
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
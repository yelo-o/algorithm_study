class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i=0; i<my_string.length(); i++) {
            if ((int) my_string.charAt(i) <= 90 ) { //대문자이면
                answer[(int) (my_string.charAt(i) - 65)]++;
            } else if ((int) my_string.charAt(i) > 90) {
                answer[(int) (my_string.charAt(i)) - 71]++;
            }
        }
        return answer;
    }
}
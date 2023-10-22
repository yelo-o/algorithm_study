class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        String[] answer = new String[len];
        for (int i=0; i<len; i++) {
            if (i%2 == 0) { //짝수 -> 소문자
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer [i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}
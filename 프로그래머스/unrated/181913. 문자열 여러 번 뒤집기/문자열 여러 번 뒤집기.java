class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for (int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j=start; j<=(start + end)/2; j++) {
                char tmp = chars[j];
                chars[j] = chars[start + end - j];
                chars[start + end - j] = tmp;
            }

        }

        for (char c : chars) {
            answer += c;
        }
        return answer;
    }
}
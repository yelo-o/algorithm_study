class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String chk;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            chk = babbling[i];
            for (int j = 0; j < words.length; j++) {
                chk = chk.replace(words[j], "1");
            }
            chk = chk.replaceAll("1", "");
            if (chk.equals("")) {
                answer += 1;
            }
        }
        return answer;
    }
}
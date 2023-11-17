class Solution {
    public String solution(int age) {
        String answer = "";
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String ageStr = String.valueOf(age); //23
        for (int i = 0; i < ageStr.length(); i++) {
            int number = Integer.parseInt(String.valueOf(ageStr.charAt(i)));
            answer += chars[number];
        }
        return answer;
    }
}
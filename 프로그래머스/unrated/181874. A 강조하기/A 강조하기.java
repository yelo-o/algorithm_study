class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArray = myString.toCharArray();
        for (int i=0; i<myString.length(); i++) {
            // System.out.print(charArray[i] + 1 + " ");
            if (charArray[i] == 'a') {
                answer += 'A';
            } else if (charArray[i] > 65 && charArray[i] < 97) {
                String s = "";
                s += charArray[i];
                String low = s.toLowerCase();
                answer += low;
            } else if (charArray[i] >= 97 ) {
                answer += charArray[i];
            } else if (charArray[i] == 32) {
                answer += " ";
            } else if (charArray[i] =='A') {
                answer += 'A';
            }
        }
        return answer;
    }
}
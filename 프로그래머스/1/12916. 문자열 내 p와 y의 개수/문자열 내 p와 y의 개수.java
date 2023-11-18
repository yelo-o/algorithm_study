class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pQuantity = 0;
        int yQuantity = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pQuantity++;
            } else if (s.charAt(i) == 'y') {
                yQuantity++;
            }
        }
        if (yQuantity != pQuantity) {
            answer = false;
        }

        return answer;
    }
}
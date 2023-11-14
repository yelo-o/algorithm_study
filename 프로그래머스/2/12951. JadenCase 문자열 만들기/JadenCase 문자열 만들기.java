class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
//            System.out.println(s.charAt(i) + ", "+ (int)(s.charAt(i)));
            if ((int) (s.charAt(i)) == 32 && i != len - 1 && i!=0) { //i번째가 빈칸이면서 마지막 순번이 아닐 때
                answer += Character.toLowerCase(s.charAt(i));
                flag = true;
            } else if (flag == true || i==0) {
                answer += Character.toUpperCase(s.charAt(i));
                flag = false;

            } else {
                answer += Character.toLowerCase(s.charAt(i));
            }
        }
        return answer;
    }
}
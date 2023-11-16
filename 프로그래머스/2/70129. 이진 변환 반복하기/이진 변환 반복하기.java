class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[2];
        int cnt = 0;
        int times = 0;
        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        while (!flag) {
            times++;
            sb.delete(0,sb.length());
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sb.append('1');
                } else {
                    cnt++;
                }
            }
            s = String.valueOf(sb);
            // System.out.println(s);
            int length = s.length();
            s = Integer.toString(length,2); //2진수로 변환
            // System.out.println("binaryNumber : "+ s);

            //0이 없는지 검증 로직
            if (s.length() == 1) {
                flag = true;
            }
        }
        answer[0] = times;
        answer[1] = cnt;
        return answer;
    }
}
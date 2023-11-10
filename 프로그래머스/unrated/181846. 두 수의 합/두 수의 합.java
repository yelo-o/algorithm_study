import java.math.BigDecimal;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigDecimal numberA = new BigDecimal(a);

        BigDecimal numberB = new BigDecimal(b);
        BigDecimal sum = numberA.add(numberB);
//        System.out.println(sum);

        answer += String.valueOf(sum);
        return answer;
    }
}
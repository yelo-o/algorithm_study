import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        List<Integer> priceList = Arrays.stream(order)
                .map(i -> i.contains("latte")? 5000:4500)
                .collect(Collectors.toList());

        for (Integer i : priceList) {
            answer += i;
        }
        return answer;
    }
}
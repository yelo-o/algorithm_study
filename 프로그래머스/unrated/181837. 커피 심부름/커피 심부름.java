import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        List<Integer> priceList = Arrays.stream(order)
                .map(i -> {
                            if (i.contains("latte")) {
                                return 5000;
                            } else {
                                return 4500;
                            }
                        }
                )
                .collect(Collectors.toList());
//        System.out.println(priceList);
        for (Integer i : priceList) {
            answer += i;
        }
        return answer;
    }
}
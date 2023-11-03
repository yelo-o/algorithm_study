import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        //IntStream 생성
        IntStream range = IntStream.range(0, myString.length());
        //IntStream -> Stream<String>
        Stream<String> stringStream = range.mapToObj(idx -> myString.substring(0, idx + 1));
        //필터링
        Stream<String> filteredStringStream = stringStream.filter(sub -> sub.endsWith(pat));

        answer = filteredStringStream.reduce("", (acc, curr) -> curr);
        return answer;
    }
}
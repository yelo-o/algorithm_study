import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i : A) {
            listA.add(i);
        }
        for (int i : B) {
            listB.add(i);
        }
        Collections.sort(listA);
        listA.sort(Comparator.naturalOrder()); //오름차순
        listB.sort((x, y) -> y - x); //내림차순
        for (int i = 0; i < listA.size(); i++) {
            answer += listA.get(i) * listB.get(i);
        }

        return answer;
    }
}
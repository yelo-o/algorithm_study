import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> lst = new ArrayList<>(); //리스트 생성
		lst.add(n);
		while(n!=1) {
			if(n%2==0) {
				n = n/2;
				lst.add(n);
			}else{
				n = 3*n + 1;
				lst.add(n);
			}
		}
		int[] answer = new int[lst.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = lst.get(i);
		}
        return answer;
    }
}
import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=l; i<=r; i++) {
			int cnt = 0;
			String strI = String.valueOf(i);
			String[] tmp = strI.split("");
			//String[] -> int[]
			int[] tmpInt = new int[tmp.length];
			for(int t=0; t<tmp.length; t++) {
				tmpInt[t] = Integer.parseInt(tmp[t]);
			}
			//
			for(int j=0; j<tmpInt.length; j++) {
				//				System.out.println("i의 값 :  " + i);
				if(tmpInt[j] != 5 && tmpInt[j] != 0) {
					break;
				}else {
					cnt++;
//					break;
				}
				if(cnt == tmpInt.length) {
					list.add(i);
				}
			}
		}
        if(list.size()==0) {
			int[] answer = new int[1];
			answer[0] = -1;
            return answer;
		}else {
			int[] answer = new int[list.size()];
			
			for(int i=0; i<answer.length;i++) {
				answer[i] = list.get(i);
				// System.out.println(answer[i]);
			}
            return answer;
		}
    }
}
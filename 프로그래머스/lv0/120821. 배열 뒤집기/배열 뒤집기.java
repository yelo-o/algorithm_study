class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        for(int i=0; i<num_list.length; i++) {
			for(int j=i+1; j<num_list.length; j++) {
                int tmp = num_list[i];
                num_list[i] = num_list[j];
                num_list[j] = tmp;
			}
		}
        answer = num_list;
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        for (int i=0; i<num_list.length; i++) {
            int tmp = 0;
            for (int j=i+1; j<num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[i + 5];
        }

        return answer;
    }
}
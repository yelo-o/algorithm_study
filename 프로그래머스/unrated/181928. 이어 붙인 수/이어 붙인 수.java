class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr = "";
        String evenStr = "";
        int odd = 0;
        int even = 0;
        
        for(int i = 0 ; i < num_list.length; i++){
            if(num_list[i]%2 == 0){
                evenStr += String.valueOf(num_list[i]);
            }else{
                oddStr += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
        
        
        return answer;
    }
}
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean bool1 = false;
        if(ineq.equals(">") && eq.equals("=")){
            if(n >= m){
                bool1 = true;
            }else{
                bool1 = false;
            }
        }else if(ineq.equals("<") && eq.equals("=")){
            if(n <= m){
                bool1 = true;
            }else{
                bool1 = false;
            }
        }else if(ineq.equals(">") && eq.equals("!")){
            if(n > m){
                bool1 = true;
            }else{
                bool1 = false;
            }
        }else if(ineq.equals("<") && eq.equals("!")){
            if(n < m){
                bool1 = true;
            }else{
                bool1 = false;
            }
        }
        if(bool1 == true){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
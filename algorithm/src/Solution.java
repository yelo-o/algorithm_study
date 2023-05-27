import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while(cnt<=n) {
        	if(n%cnt==0) {
        		answer += cnt;
        	}
        	cnt++;
        }
        return answer;
    }
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    	Solution s = new Solution();
    	int n = Integer.parseInt(sc.nextLine());
    	System.out.println(s.solution(n));
    }
}
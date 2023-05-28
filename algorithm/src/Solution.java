import java.util.Scanner;
class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer =new int[n];
		for(int i=0; i<n; i++){
			answer[i] = num_list[i];
		}
		return answer;
	}
	public void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		int[] num_list = new int[] {2,1,6};
		int n = Integer.parseInt(sc.nextLine());
		Solution s = new Solution();
		int [] returnArr = s.solution(num_list, n);
		s.print(returnArr);
	}
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int cnt = queries.length; // 수행횟수
		int[] answer = new int[cnt]; // 수행 횟수 크기에 맞는 answer 배열 생성
        for(int n = 0 ; n < answer.length ; n++) {
			int s = queries[n][0];
			int k = queries[n][2];
			int e = queries[n][1];
			for(int i=0; i<arr.length; i++) {
				if(i>=s && i<=e) {
					if(i%k==0) {
						arr[i] = arr[i] + 1;
					}
				}
			}
		}
        
        return arr;
    }
}
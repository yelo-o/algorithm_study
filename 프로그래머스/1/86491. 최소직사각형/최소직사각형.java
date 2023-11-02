class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int preMax = 0;
        int preMin = 0;
        for (int[] size : sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            preMax = Math.max(curMax, preMax);
            preMin = Math.max(curMin, preMin);

        }
        answer = preMax * preMin;
        return answer;
    }
}
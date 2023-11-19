import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String numberStr = String.valueOf(n);
        int len = numberStr.length();
        System.out.println("length of array : " + len);
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(numberStr.charAt(i));
            String str = String.valueOf(sb);
            arr[i] = Integer.parseInt(str);
        }
        
        Arrays.sort(arr, (x, y) -> y - x);

        for(int i=0; i< arr.length; i++) {
            answer += arr[i] * (long) Math.pow(10, len-1);
            len-=1;

        }
        return answer;
    }
}
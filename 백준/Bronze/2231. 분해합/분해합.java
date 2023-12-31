import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String NStr = String.valueOf(N);
        int start = N - 9 * NStr.length();
        int answer = 0;
        for (int i = start; i < N; i++) {
            int sum = 0;
            String iStr = String.valueOf(i);
            int len = iStr.length();
            sum += i;
            int constructor = sum;
            for (int j = 0; j < len; j++) {
                char numChar = iStr.charAt(j);
                int num = numChar - '0';
                sum += num;
            }
            if (sum == N) {
                answer = constructor;
                break;
            }
        }
        System.out.println(answer);
    }
}

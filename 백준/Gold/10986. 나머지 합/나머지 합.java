import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //  배열의 크기 : n
        int M = sc.nextInt(); // 나누어지는 수 : m
        long[] S = new long[N];
        long[] count = new long[M];
        S[0] = sc.nextInt();
        long answer = 0;
        //합 배열 S 만들기
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }
        // 합 배열 S의 모든 원소를 % 연산 수행하기
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) { // 0 ~ i 까지의 구간 합 자체가 0인 경우 ++
                answer++;
            }
            count[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (count[i] > 1) {
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
                answer += (count[i] * (count[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}

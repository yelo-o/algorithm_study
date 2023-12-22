import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] S = new long[n + 1]; // 합 배열 생성
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); // S[i] = S[i - 1] + A[i] 
        }
        for (int q = 0; q < m; q++) { // i부터 j까지의 구간 합 
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}

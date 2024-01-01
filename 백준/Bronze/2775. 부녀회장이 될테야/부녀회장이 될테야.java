import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int answer = getNumber(k, n);
            System.out.println(answer);
        }
    }

    private static int getNumber(int k, int n) {
        if (k == 0) {
            return n;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += getNumber(k - 1, i);
            }
            return sum;
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long N = Long.parseLong(str[0]);
        for (long i = 1; i <= 9; i++) {
            long ans = N * i;
            System.out.println(N + " * " + i + " = " + ans);
        }
    }
}
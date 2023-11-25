import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb;

        for (int i = 1; i <= n; i++) {
            int cnt = 1;
            sb = new StringBuilder();
            while (cnt <= i) {
                sb.append("*");
                cnt++;
            }
            System.out.println(sb);
        }

    }
}

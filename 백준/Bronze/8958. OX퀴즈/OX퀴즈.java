import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        for (int k = 0; k < n; k++) {
            String s = sc.nextLine();
            int len = s.length();
            int count = 0;
            int sum = 0;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == 'O') {
                    count++;
                    sum += count;
                } else if (s.charAt(i) == 'X') {
                    count = 0;
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

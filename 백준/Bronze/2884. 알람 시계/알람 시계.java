import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        if (B >= 45) {
            B -= 45;
            System.out.println(A + " " + B);
        } else if (B < 45) {
            if (A == 0) {
                A = 23;
                B = 60 - 45 + B;
                System.out.println(A + " " + B);
            } else if (A > 0) {
                A -= 1;
                B = 60 - 45 + B;
                System.out.println(A + " " + B);
            }
        }
    }
}
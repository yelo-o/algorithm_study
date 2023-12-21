import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            if (n % h == 0) {
                System.out.println((h * 100) + (n / h));
            } else {
                System.out.println(((n % h) * 100) + ((n / h) + 1));
            }
        }
    }
}

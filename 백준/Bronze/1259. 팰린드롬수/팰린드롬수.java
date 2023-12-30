import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (Integer.parseInt(s) == 0) {
                break;
            }
            String reverse = "";
            int len = s.length();
            // String s의 순서를 바꾸기
            for (int i = len - 1; i >= 0; i--) {
                reverse += s.charAt(i);
            }
            if (s.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

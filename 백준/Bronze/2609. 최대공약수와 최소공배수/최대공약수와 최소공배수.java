import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int GCD = getGCD(num1, num2); // Greatest Common Divisor
        int LCM = (num1 * num2) / GCD; // Least Common Multiple
        System.out.println(GCD);
        System.out.println(LCM);
    }

    private static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}

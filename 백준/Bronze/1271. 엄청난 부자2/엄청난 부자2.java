import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        BigInteger[] bigIntegers = n.divideAndRemainder(m);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);

    }
}

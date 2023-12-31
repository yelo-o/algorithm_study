import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int roomNum = 1;
        int a = 3, b= 0;
        int min;
        int max = 0;
        while (true) {
            if (roomNum == 1) {
                max = 1;
                if (N == roomNum) {
                    System.out.println(roomNum);
                    break;
                }
                roomNum++;
            } else {
                min = max + 1;
                max = min + (a + b) * 2 - 1;
                if (N >= min && N <= max) {
                    System.out.println(roomNum);
                    break;
                }
                a += 2;
                b++;
                roomNum++;
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        int minSum = min + time;

        if (minSum < 60) {
            System.out.println(hour + " " + minSum);
        } else {
            int hourIncrease = (minSum / 60);
            hour += hourIncrease;
            if (hour >= 24) {
                hour %= 24;
            }
            minSum -= 60;
            minSum %= 60;
            System.out.println(hour + " " + minSum);
        }

    }
}
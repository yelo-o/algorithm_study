import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        sc.nextLine();

        int answer = 0; // 정답 소수 카운
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int number = arr[i];
            for (int j = 1; j < number; j++) { // number를 숫자 1부터 나눴을 때 나머지가 0일 때가 오직 1번
                if (number % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}

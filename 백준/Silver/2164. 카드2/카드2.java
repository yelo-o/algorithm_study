import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }
        while (myQueue.size() > 1) {
            myQueue.poll(); // 맨 위에 카드 버린다.
            int temp = myQueue.poll(); // 하나를 다시 뽑아서
            myQueue.add(temp); // 아래에 넣는다.
        }
        System.out.println(myQueue.poll());
    }
}

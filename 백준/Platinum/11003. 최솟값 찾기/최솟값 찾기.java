import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Node> mydeque = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }
            mydeque.addLast(new Node(now, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if (mydeque.getFirst().index <= i - L) {
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static class Node {
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}

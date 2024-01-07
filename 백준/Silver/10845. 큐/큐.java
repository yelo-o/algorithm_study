import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    que.offer(last);
                    break;
                case "pop" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    if(que.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.peek()).append("\n");
                    break;
                case "back" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

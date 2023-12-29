import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<String> answerList = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                list.add(a);
                list.add(b);
                list.add(c);
                Collections.sort(list);
                a = list.get(0);
                b = list.get(1);
                c = list.get(2);
                if (a * a + b * b == c * c) {
                    answerList.add("right");
                } else {
                    answerList.add("wrong");
                }
                list.clear();
            }
        }
        for (String s : answerList) {
            System.out.println(s);
        }
        br.close();
    }
}

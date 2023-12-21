import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int[] out = new int[26]; // a는 0번
        List<Character> list = new ArrayList<>();

        // 모든 배열에 -1 넣기
        for (int i = 0; i < 26; i++) {
            out[i] = -1;
        }

        for (int i = 0; i < len; i++) {
            char alphabet = s.charAt(i);
            if (!list.contains(alphabet)) {
                int ascii = (int) alphabet - 97;
                out[ascii] = i;
                list.add(alphabet);
            }
        }

        for (int i : out) {
            System.out.print(i +  " ");
        }
    }
}

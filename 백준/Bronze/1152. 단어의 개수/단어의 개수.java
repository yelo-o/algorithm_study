import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int count = str.length;
        for (String s : str) {
            if (s.isEmpty()) {
                count--;
            }
        }
        System.out.println(count);

    }
}
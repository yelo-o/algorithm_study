import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String[] str = br.readLine().split(" ");

        for (String s : str) {
            if (Integer.parseInt(s) < x) {
                bw.append(s + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

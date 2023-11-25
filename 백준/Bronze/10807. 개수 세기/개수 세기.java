import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[] str = br.readLine().split(" ");
        st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) == target) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}

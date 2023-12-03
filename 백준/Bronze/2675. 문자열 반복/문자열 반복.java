import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine()); //2
        for (int i = 0; i < lines; i++) {
            String[] split = br.readLine().split(" ");
            int times = Integer.parseInt(split[0]);
            String words = split[1];
            String ans = "";
            for (int k = 0; k < words.length(); k++) {
                for (int j = 0; j < times; j++) {
                    ans += words.charAt(k);
                }
            }
            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

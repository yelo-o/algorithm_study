import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        for (int i = 0; i < lines; i++) {
            // 초기화
            String tmp = "";
            int j = 1;
            while (j <= (lines - 1 - i)) {
                tmp += " ";
                j++;
            }
            j = 1;
            while (j <= (i + 1)) { 
                tmp += "*";
                j++;
            }
            bw.write(tmp + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

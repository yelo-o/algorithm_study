import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            sum *= Integer.parseInt(br.readLine());
        }
        String strSum = String.valueOf(sum);
        int len = strSum.length();
        int[] intArr = new int[10];

        for (int i = 0; i < len; i++) {
            String tmp = "";
            tmp += strSum.charAt(i);
            int num = Integer.parseInt(tmp);
            intArr[num]++;
        }
        for (int i=0;i<10;i++) {
            if (i < 9) {
                bw.write(intArr[i] + "\n");
            } else {
                bw.write(String.valueOf(intArr[i]));
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

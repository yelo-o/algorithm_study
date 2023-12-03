import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String numberStr = br.readLine();
        String[] numbers = numberStr.split(" ");
        int[] arr = new int[times];
        for (int i = 0; i < times; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < times; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();

    }
}

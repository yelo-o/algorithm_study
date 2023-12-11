import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int[] arr = new int[split.length];

        //arr 선언
        int[] ascArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] descArr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};

        int asc = 0;
        int decs = 0;

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ascArr[i]) {
                asc++;
            } else if (arr[i]==descArr[i]) {
                decs++;
            }
        }
        if (asc == 8) {
            bw.write("ascending");
        } else if (decs == 8) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

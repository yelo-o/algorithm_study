import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 정수 배열에 입력값 넣은 후 정렬
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = i+2; k < N; k++) {
                    if (arr[i] == arr[j] || arr[j] == arr[k]) { // 같은 숫자의 카드를 두번 뽑지 않도록
                        continue;
                    }
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > max && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] A = new long[N];
        long result = 0;
        
        for (int i=0; i<N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(A);

        for (int k=0; k<N; k++) {
            long find = A[k]; // 찾고자 하는 값
            int i = 0;
            int j = N - 1;
            // 투 포인터 알고리즘
            while(i < j) {
                if (A[i] + A[j] == find) {
                    if (i!=k && j!=k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();
        
    }
}
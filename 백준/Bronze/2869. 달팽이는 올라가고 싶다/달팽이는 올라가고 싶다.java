import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long up = Long.parseLong(st.nextToken());
        long down = Long.parseLong(st.nextToken());
        long goal = Long.parseLong(st.nextToken());

        long day = (goal - down) / (up - down);
        if ((goal - down) % (up - down) != 0) { // 잔여 나무 막대가 있을 경우, 한번 더 올라 가야 한다.(하루 더 소요)
            day++;
        }
        System.out.println(day);
    }
}
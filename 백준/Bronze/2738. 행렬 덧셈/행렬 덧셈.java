import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);

		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i=0; i<n; i++) { //0, 1, 2, 3, 4, 5
			String[] row = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				list.add(Integer.parseInt(row[j]));
			}
		}
		for (int i=0; i<n; i++) { //0, 1, 2, 3, 4, 5
			String[] row = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				list2.add(Integer.parseInt(row[j]));
			}
		}
		for (int i = 0; i < n * m; i++) {
			int sum = list.get(i) + list2.get(i);
			bw.write(String.valueOf(sum));
			if ((i + 1) % n == 0) {
				bw.write("\n");
			} else {
				bw.write(" ");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

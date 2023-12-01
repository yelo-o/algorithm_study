import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = 9;
		int[] originArr = new int[T];
		int[] arr = new int[T];
		int max, order = 0;

		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			originArr[i] = Integer.parseInt(s);
			arr[i] = Integer.parseInt(s);
		}

		for (int i = 0; i < T; i++) {
			for (int j = i + 1; j < T; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		max = arr[0];
		for (int i = 0; i < T; i++) {
			if (originArr[i] == max) {
				order = i+1;
			}
		}
		bw.write(max + "\n" + order);
		
		bw.flush();
		bw.close();
		br.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Set<Integer> set = new HashSet<>();
		for (int i=1; i<=30; i++) {
			set.add(i);
		}
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 28;
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (set.contains(n)) {
				set.remove(n);
			}
		}
		//출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			bw.write(String.valueOf(iter.next())+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}

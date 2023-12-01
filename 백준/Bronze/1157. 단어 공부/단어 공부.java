import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String words = br.readLine().toUpperCase();
		
		int max = 0;
		Character answer = null;
		boolean flag = false;

		List<Character> list = new ArrayList<>();
		for (int i = 0; i < words.length(); i++) {
			list.add(words.charAt(i));
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}
		Set<Character> keySet = map.keySet();
		Iterator<Character> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Character c = iterator.next();
			int val = map.get(c);
			if (val > max) {
				max = val;
				answer = c;
				flag = false;
			} else if (max != 0 && val == max) {
				flag = true;
			}
		}

		if (!flag) {
			bw.write(answer);
		} else {
			bw.write("?");
		}


		bw.flush();
		bw.close();
		br.close();
	}
}

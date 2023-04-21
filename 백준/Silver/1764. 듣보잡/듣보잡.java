import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer>hm = new HashMap();
		ArrayList<String> list = new ArrayList();
		
		for(int i = 0; i < n+m; i++) {
			String name = br.readLine();
			hm.put(name, hm.getOrDefault(name, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			if(entry.getValue() >= 2)
				list.add(entry.getKey());
		}
		Collections.sort(list);
		
		sb.append(list.size()).append('\n');
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append('\n');
		}

		System.out.println(sb);
		
	}

}

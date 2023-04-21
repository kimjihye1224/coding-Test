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
		HashMap<String, String> hm = new HashMap();
		
		for(int i = 1; i <= n; i++) {
			String name = br.readLine();
			String number = Integer.toString(i);
			hm.put(number, name);
			hm.put(name, number);
		}
		
		for(int i = 0; i < m; i++) {
			sb.append(hm.get(br.readLine())).append('\n');
		}
		System.out.println(sb);
		
		
	}

}

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
//		int m = Integer.parseInt(br.readLine());
//		int{} number = {-2, 3, 0, 2, -5};
//		int count = 0;
//		System.out.println();

		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			boolean check = false;
			
			for(int i = x; i < (m * n); i += m) {
				if(i % n == y) {
					sb.append(i+1).append('\n');
					check = true;
					break;
				}
			}
			
			if(!check)
				sb.append(-1).append('\n');
			
		}
		System.out.println(sb);


	}

}

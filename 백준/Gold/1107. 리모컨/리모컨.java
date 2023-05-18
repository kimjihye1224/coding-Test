import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
//		st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//		int t = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
//		int m = Integer.parseInt(br.readLine());
//		int{} number = {-2, 3, 0, 2, -5};
//		int count = 0;
//		System.out.println();

		int now = 100;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		if (n == 100) {
			System.out.println(0);
			return;
		}
		if (m != 0)
			st = new StringTokenizer(br.readLine());


		boolean[] broken = new boolean[10];

		for (int i = 0; i < m; i++) {
			broken[Integer.parseInt(st.nextToken())] = true;
		}

		int result = Math.abs(n - 100); // +, - 만 누르는 경우.
		for (int i = 0; i < 999999; i++) {
			String str = String.valueOf(i);
			int len = str.length();

			boolean isBreak = false;
			for (int j = 0; j < len; j++) {
				if (broken[str.charAt(j) - '0']) {
					isBreak = true;
					break;
				}
			}

			if (!isBreak) {
				int min = len + Math.abs(n - i);
				result = Math.min(min, result);
			}
		}
		System.out.println(result);
	}

}

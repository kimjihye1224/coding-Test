import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int m = Integer.parseInt(br.readLine());

		int bitmask = 0;
		int num = 0;
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				bitmask |= (1 << (num-1));
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				bitmask &= ~(1 << (num - 1));
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				sb.append(((bitmask & (1 << (num - 1))) != 0 ? "1\n" : "0\n"));
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				bitmask ^= (1 << (num - 1));
				break;
			case "all":
				bitmask |= (~0);
				break;
			case "empty":
				bitmask &= 0;
				break;
			}
        
		}
        System.out.println(sb);
	}

}

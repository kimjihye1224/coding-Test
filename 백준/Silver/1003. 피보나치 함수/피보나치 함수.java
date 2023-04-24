import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		int[] dp = new int[41];
		dp[0] = 0; dp[1] = 1;
        
		for(int i = 2; i <= 40; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0)
				sb.append("1 0").append('\n');
			else
				sb.append(dp[n-1] + " " + dp[n]).append('\n');
		}
		
		System.out.print(sb);
	}

}

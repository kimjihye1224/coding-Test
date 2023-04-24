import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] stairs = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = stairs[1];
		
		if(n >=2)
			dp[2] = stairs[1] + stairs[2];
		
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
		}
		
		System.out.print(dp[n]);
	}

}

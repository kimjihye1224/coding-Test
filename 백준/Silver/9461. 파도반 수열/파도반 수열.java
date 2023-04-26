import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		long[] dp = new long[101];
		dp[1] = dp[2] =  dp[3] = 1;
		dp[4] = dp[5] = 2;
		for(int i = 6; i <= 100; i++) {
			dp[i] = dp[i - 5] + dp[i-1];
		}
		
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
		}
	}

}

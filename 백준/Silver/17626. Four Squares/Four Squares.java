import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n+1];
		dp[0] = 0; dp[1] = 1;

		int min;
		for (int i = 2; i <= n; i++) {
			min = Integer.MAX_VALUE;
			
			for(int j = 1; j * j <= i; j++) {
				min = Math.min(min, dp[i - (j * j)]);
			}
			
			dp[i] = min + 1;
			
		}
		
		System.out.println(dp[n]);

	}

}

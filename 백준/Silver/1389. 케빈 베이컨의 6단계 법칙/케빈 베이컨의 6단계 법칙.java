import java.io.*;
import java.util.*;

public class Main {
	
	private static int INF = 99999;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
        
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		
		int[][] graph = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) graph[i][j] = 0;
				else
					graph[i][j] = INF;
				
			}
		}

		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		
		for(int i = 1; i <= n; i++) {
			int sum = 0;
			
			for(int j = 1; j <= n; j++) {
				sum+= graph[i][j];
			}
			if(min > sum) {
				min = sum;
				minIndex = i;
			}
		}
		
		System.out.println(minIndex);

	}

}

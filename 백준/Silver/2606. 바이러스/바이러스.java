import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] arr = new int[n+1][n+1];
		
		for(int i = 0; i <m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;
		}
		
		boolean[] visit = new boolean[n+1];
		visit[1] = true;
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		
		int count = 0;
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int i = 1; i <= n; i++) {
				if(arr[v][i] == 1 && !visit[i]) {
					visit[i] = true;
					q.add(i);
					count++;
				}
			}
					
		}
		
			
		System.out.print(count);
	}

}

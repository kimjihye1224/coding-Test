import java.io.*;
import java.util.*;

public class Main {

	static int n, k;
	static int[] visited = new int[100001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		if(n == k)
			System.out.println(0);
		else
			bfs(n);
	}

	public static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(node);
		visited[node] = 1;
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			for(int i = 0; i < 3; i++) {
				int next;
				if(i == 0)
					next = n+1;
				else if(i == 1)
					next = n - 1;
				else
					next = n * 2;
				
				if(next == k) {
					System.out.println(visited[n]);
					return;
				}
				
				if(next > 0 && next < visited.length && visited[next] == 0) {
					q.add(next);
					visited[next] = visited[n]+1;
				}
			}
			
		}
		
	}

}

import java.io.*;
import java.util.*;

public class Main {
	
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
	static int m,n;
	static int[][] tomato;
	static Queue<int[]> q = new LinkedList<>();
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		tomato = new int[n][m];
		
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int n = Integer.parseInt(st.nextToken());
				tomato[i][j] = n;
				if(n == 1)
					q.add(new int[]{i,j});
			}
		}
		
		System.out.println(bfs());
		
	}

	public static int bfs() {
		while(!q.isEmpty()) {
			int[] t = q.poll();
			int x = t[0];
			int y = t[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				if(tomato[nx][ny] == 0) {
					tomato[nx][ny] = tomato[x][y] + 1;
					q.add(new int[] {nx, ny});
				}
			}
			
		}
		
		int max = Integer.MIN_VALUE;
		if(check()) 
			return -1;
		else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(max < tomato[i][j])
						max = tomato[i][j];
				}
			}
			return max - 1;
		}
		
		
	}
	
	static boolean check() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(tomato[i][j] == 0)
					return true;
			}
		}
		
		return false;
	}

}

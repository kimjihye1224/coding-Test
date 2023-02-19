import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;

public class Main {

	public static int n, m;
	public static int[][] graph = new int[100][100];
	
	
	public static boolean dfs(int x, int y) {
		if(x <= -1 || x >= n || y <= -1 || y >= m)
			return false;
		
		if(graph[x][y] == 0) {
			graph[x][y] = 1;
			
			dfs(x-1,y);
			dfs(x+1,y);
			dfs(x,y-1);
			dfs(x,y+1);
			
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		graph[i][j] =  Integer.parseInt(st.nextToken());
        	}
        }
        
        int result = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		if(dfs(i, j))
        			result += 1;
        	}
        }
        System.out.println(result);
        	
        
        
	}

}

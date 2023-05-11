import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());	
		map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			for(int j = 0; j < n; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		
		find(0,0,n);
		
		System.out.println(sb);

	}
	
	static void find(int x, int y, int size) {
		
		if(check(x, y, size)) {
			sb.append(map[x][y]);
			return;
		}
		
		sb.append("(");
		int newSize = size / 2;
		find(x, y, newSize);
		find(x, y+newSize, newSize);
		find(x+newSize, y, newSize);
		find(x+newSize, y+newSize, newSize);
		sb.append(")");
		
	}
	
	
	static boolean check(int x, int y, int size) {
		int color = map[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(color != map[i][j])
					return false;
			}
		}
		
		return true;
	}
}

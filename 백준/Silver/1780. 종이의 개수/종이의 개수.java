import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	static int minus = 0;
	static int zero = 0;
	static int one = 0;	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		int n = Integer.parseInt(br.readLine());

		map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0,0,n);
		System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
	}

	
	static void partition(int x, int y, int size) {
		
		if(check(x,y,size)) {
			if(map[x][y] == -1)
				minus++;
			else if(map[x][y] == 0)
				zero++;
			else
				one++;
			
			return;
		}
		
		int newSize = size / 3;
		partition(x, y, newSize);
		partition(x, y+newSize, newSize);
		partition(x, y+ 2 *newSize, newSize);
		
		partition(x+newSize, y, newSize);
		partition(x+newSize, y+newSize, newSize);
		partition(x+newSize, y+2*newSize, newSize);

		partition(x+ 2 * newSize, y, newSize);
		partition(x+2*newSize, y+newSize, newSize);
		partition(x+2*newSize, y+2*newSize, newSize);
		
	}
	
	static boolean check(int x, int y, int size) {
		int color = map[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(map[i][j] != color)
					return false;
			}
		}
		
		return true;
	}
}

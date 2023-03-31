import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] picture = new int[101][101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			
			for(int j = x1; j <= x2; j++) {
				for(int k = y1; k <= y2; k++) {
					picture[j][k] += 1;
				}
			}
		}
		
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				if(picture[i][j] >m) count++;
			}
		}
		
		System.out.println(count);
	}

}
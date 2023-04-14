import java.io.*;
import java.util.*;

public class Main {
	static int[][] map = new int[15][15];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
				
		for(int i = 0; i < 15; i++) {
			map[0][i]= i+1;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				for(int k = 0; k <= j; k++) {
					map[i][j] += map[i-1][k];
				}
			}
		}
		
		
		while(t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(map[k][n-1]);
		}
	}
}
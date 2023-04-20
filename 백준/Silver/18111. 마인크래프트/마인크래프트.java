import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

//		int m = Integer.parseInt(st.nextToken());
//		int n = Integer.parseInt(st.nextToken());
//		int[] number = {-2, 3, 0, 2, -5};
//		int count = 0;
//		StringBuilder sb = new StringBuilder();
//		System.out.println();

//		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int v = Integer.parseInt(st.nextToken());
				map[i][j] = v;
				
				max = Math.max(max, v);
				min = Math.min(min, v);
			}
		}
		
		int minTime = Integer.MAX_VALUE;
		int height = 0;
		
		for(int i = min; i <= max; i++) {
			int blocks = b;
			int time = 0;
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(map[j][k] > i) {
						time += (map[j][k] - i) * 2;
						blocks += (map[j][k] - i);
					}else if(map[j][k] < i) {
						time += (i - map[j][k]);
						blocks -= (i - map[j][k]);
					}
				}
			}
			
			if(blocks >= 0 && minTime >= time) {
				minTime =time;
				height = i;
			}
			
		}
		
		System.out.println(minTime + " " + height);
	}

}

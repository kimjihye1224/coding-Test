import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
//		int m = Integer.parseInt(br.readLine());
//		int{} number = {-2, 3, 0, 2, -5};
//		int count = 0;
//		System.out.println();
		
		int[][] graph = new int[t][t];
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < t; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k = 0; k < t; k++) {
			for(int i = 0; i < t; i++) {
				for(int j = 0; j < t; j++) {
					if(graph[i][k] == 1 && graph[k][j] == 1)
						graph[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

	}

}

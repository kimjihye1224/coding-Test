import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] picture = new int[101][101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int hcount = 0, vcount = 0;
		int n = Integer.parseInt(br.readLine());
		char[][] room = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				room[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			int check_h = 0, check_v = 0;
			for(int j=0; j<n; j++) {
				// 가로 체크
				if(room[i][j] == '.') check_h++;
				if(room[i][j] == 'X'|| (j == n-1)) {
					if(check_h >= 2) hcount++;
					check_h = 0;
				}
				
				// 세로 체크
				if(room[j][i] == '.') check_v++;
				if(room[j][i] == 'X' || (j == n-1)) {
					if(check_v >= 2) vcount++;
					check_v = 0;
				}
			}
		}
		
		System.out.println(hcount + " " + vcount);
	}

}
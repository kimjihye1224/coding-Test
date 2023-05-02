import java.io.*;
import java.util.*;

public class Main {

	static int[][] map;
	static int wCount = 0;
	static int bCount = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		int n = Integer.parseInt(br.readLine());

		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		find(n, 0, 0);
		System.out.println(wCount);
		System.out.println(bCount);

	}

	static void find(int size, int r, int c) {

		if (check(size, r, c)) { // 전체가 같은 색일 경우
			if (map[r][c] == 0)
				wCount++;
			else
				bCount++;
			
			return;

		}
		
		int nSize = size / 2;
		find(nSize, r, c);
		find(nSize, r, c + nSize);
		find(nSize, r + nSize, c);
		find(nSize, r+nSize, c + nSize);

	}


	static boolean check(int size, int r, int c) {
		int f = map[r][c];
		
		for (int i = r; i < r + size; i++) {
			for (int j = c; j < c + size; j++) {
				if (map[i][j] != f)
					return false;
			}
		}
		return true;
	}

}

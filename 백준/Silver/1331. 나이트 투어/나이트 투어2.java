import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static int dx[] = new int[] { 1, 1, 2, 2, -1, -1, -2, -2 };
	public static int dy[] = new int[] { -2, 2, -1, 1, -2, 2, -1, 1 };
	public static boolean flag;
	public static int[][] isCan = new int[6][6];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String start = br.readLine();
		int x = start.charAt(0) - 'A';
		int y = start.charAt(1) - '1';

		isCan[x][y] = 1;

		int pX = x;
		int pY = y;

		for (int i = 0; i < 35; i++) {
			String last = br.readLine();

			int lx = last.charAt(0) - 'A';
			int ly = last.charAt(1) - '1';

			flag = false;

			for (int k = 0; k < 8; k++) {
				int nx = dx[k] + pX;
				int ny = dy[k] + pY;

				if (nx < 0 || 6 <= nx || ny < 0 || ny >= 6)
					continue;

				if (nx == lx && ny == ly && isCan[nx][ny] == 0) { // 8방향 중  하나이고 방문하지 않았다면
					isCan[lx][ly] = 1;
					flag = true;
					break;
				}

			}
			
			if(flag) {
				pX = lx;
				pY = ly;
			}else {
				System.out.println("Invalid");
				return;
			}
		}
		
		//마지막 위치에서 시작 위치로 돌아올 수 있는지.
		flag = false;
		for(int i = 0; i < 8; i++) {
			if((pX + dx[i] == x) && (pY + dy[i] == y)) {
				flag = true;
				break;
			}
		}
		
		if(flag) System.out.println("Valid");
		else System.out.println("Invalid");
		
		
	}

}

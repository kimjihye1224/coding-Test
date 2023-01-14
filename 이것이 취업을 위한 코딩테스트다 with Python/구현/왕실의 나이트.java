import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String spot = br.readLine();
		int x = spot.charAt(1) - '0';
		int y = spot.charAt(0) - 'a' + 1;
		
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8)
				count++;
		}
		System.out.print(count);
	}

}

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		int point;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i = 0; i < n; i++) {
			point = 1;
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				
				if((x[i] < x[j]) && (y[i] < y[j]))
					point++;
			}
			System.out.print(point + " ");
		}
		
		
	}
}
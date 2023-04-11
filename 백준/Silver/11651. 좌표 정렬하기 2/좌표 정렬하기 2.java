import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] s1, int[] s2) {
				
				if(s1[1] == s2[1]) {
					return s1[0] - s2[0];
				}
				return s1[1] - s2[1];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1]);
   	 	}
		
	}
}
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		int min = 0, max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(max < list[i]) max = list[i];
		}
		
		while(min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			
			for(int h : list) {
				if(h - mid > 0)
					sum += (h - mid);
			}
			
			if(sum < m) {
				max = mid;
			}else {
				min = mid + 1;
			}
			
		}
		System.out.println(min - 1);
	}

}

import java.io.*;
import java.util.*;

public class Main {

	static int[] list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int result = binary(Integer.parseInt(st.nextToken()));
			
			if(result != -1) sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}
		
		System.out.print(sb);
	}

	public static int binary(int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(low <= high) {
			int mid = (low+high) / 2;
			
			if(key < list[mid])
				high = mid-1;
			else if(key > list[mid])
				low = mid+1;
			else
				return mid;
		}
		
		
		return -1;
	}
}
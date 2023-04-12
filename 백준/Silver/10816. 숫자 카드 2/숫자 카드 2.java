import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upper(arr, key) - lower(arr,key)).append(' ');
		}
		
		System.out.print(sb);
	}

	public static int lower(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid = (low+high) / 2;
			
			if(key <= arr[mid])
				high = mid;
			else
				low = mid+1;
		}
		return low;
	}
	
	public static int upper(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			
			int mid = (low+high) / 2;
			
			if(key < arr[mid])
				high = mid;
			else
				low = mid+1;
		}
		return low;
		
	}
}
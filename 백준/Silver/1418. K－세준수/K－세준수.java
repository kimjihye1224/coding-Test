import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			int now = i;
			int max = 0;
			for(int j = 2; j <= Math.sqrt(i);) {
				 if(now % j == 0) {
					 now /= j;
					 max = j;
				 }else {
					 j++;
				 }
			}
			
			if(now != 1) max = now;
			if(max <= k) 
				count++;
			
		}
		System.out.println(count);
	}

}

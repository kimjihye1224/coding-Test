import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		int count = 0;
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) continue;
			
			if(prime(n)) count++;
			
		}
		
		System.out.print(count);
	}
	
	public static boolean prime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
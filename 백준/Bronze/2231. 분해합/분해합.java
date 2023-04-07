import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n= Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i = 0;  i < n; i++) {
			int sum = i;
			int k = i;
			while(k > 0) {
				sum += k % 10;
				k /= 10;
			}
			
			if(sum == n) {
				result = i;
				break;
			}
			
		}
		
		System.out.println(result);
	}
}
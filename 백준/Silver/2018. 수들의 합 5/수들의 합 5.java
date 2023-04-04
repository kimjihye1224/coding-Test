import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int start=1, end = 1;
		int count = 0, sum = 1;
		
		while(start <= end) {
			if(sum == n) count++;
			
			if(sum < n) {
				end++;
				sum += end;
			}else if (sum >= n) {
				sum -= start;
				start++;
			}
		}
		System.out.println(count);
	}

}
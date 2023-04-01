import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] picture = new int[101][101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(n >= 5) {
			count += n/5;
			n /= 5;
		}
		System.out.println(count);
	}

}
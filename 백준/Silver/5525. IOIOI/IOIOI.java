import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		char[] s = br.readLine().toCharArray();
		int count = 0;
		int result = 0;
		
		for(int i = 1; i < m - 1; i++) {
			if(s[i-1] == 'I' && s[i] == 'O' && s[i+1] == 'I') {
				count++;
				if(count == n) {
					count--;
					result++;
				}
				i++;
			}else {
				count = 0;
			}
		}
		
		
		System.out.println(result);
		
		

	}
	

	
	

}

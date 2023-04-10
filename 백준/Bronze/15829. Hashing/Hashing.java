import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
	
		long sum = 0; 
		for(int i = 0; i < n; i++) {
			sum += (s.charAt(i) - 96) * Math.pow(31, i);
			sum %= 123456781;
		}
		
		System.out.println(sum % 1234567891);
	}

}
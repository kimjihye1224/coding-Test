import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int g = (a > b) ? gcd(a,b) : gcd(b,a);
		System.out.println(g);
		System.out.println(a * b / g);
			
	}

	public static int gcd(int a, int b) {
		if(a % b == 0)
			return b;
		
		return gcd(b, a % b);
	}
}
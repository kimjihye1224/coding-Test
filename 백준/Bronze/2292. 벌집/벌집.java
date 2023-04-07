import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int range = 2, count = 1;
		
		if (n == 1)
			System.out.println(1);
		else {
			while(range <= n) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
	}
}
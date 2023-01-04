import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		
		int n = y;
		for(int i = 0; i < x- 1; i++) {
			n += months[i];
		}

		System.out.println(days[n % 7]);
		
	}

}
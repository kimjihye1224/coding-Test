import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int min = 1000000;
		int max = -1000000;
		
		int num = 0;
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(st.nextToken());
			if(num > max)
				max = num;
			
			if(num < min)
				min = num;
			
			//min = Math.min(min, num);
			//max = Math.max(max, num);
		}
		

		System.out.println(min + " " + max);
		
	}

}


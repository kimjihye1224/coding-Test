import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
			
		int[] list = new int[3];
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			list[0] = Integer.parseInt(st.nextToken());
			list[1] = Integer.parseInt(st.nextToken());
			list[2] = Integer.parseInt(st.nextToken());
			
			if(list[0]+list[1] +list[2]== 0)
				break;
			
			Arrays.sort(list);
			
			if(list[2]*list[2] == list[1] * list[1] + list[0] * list[0])
				System.out.println("right");
			else
				System.out.println("wrong");
		}

		
	}
	
		

}
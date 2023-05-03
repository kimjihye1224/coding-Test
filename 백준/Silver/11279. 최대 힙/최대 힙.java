import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		while(n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				if(pq.size() == 0)
					System.out.println(0);
				else
				    System.out.println(pq.poll());
			}else {
				pq.add(num);
			}
		}

	}



}

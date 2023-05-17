import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				
				if(Math.abs(o1) > Math.abs(o2))
					return Math.abs(o1) - Math.abs(o2);
				else if(Math.abs(o1) == Math.abs(o2))
					return o1 - o2;
				else
					return -1;	
			}
		});
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				if(pq.isEmpty())
					sb.append(0).append('\n');
				else 
					sb.append(pq.poll()).append('\n');
			}else {
				pq.offer(n);
			}
			
		}
		System.out.println(sb);


	}

}

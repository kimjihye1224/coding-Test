import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
        
		int count = 1;		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i<= n; i++) {
			q.add(i);
		}
		
		sb.append("<");
		while(!q.isEmpty()) {
			if(count == k) {
				sb.append(q.poll());
				count = 1;
				
				if(q.size() != 0) sb.append(", ");
				continue;
			}
			
			q.add(q.poll());
			count++;
		}
		sb.append(">");
		System.out.print(sb);
		
	}

}
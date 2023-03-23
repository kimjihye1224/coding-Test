import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int dasom = Integer.parseInt(br.readLine());
		int cnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		if(t == 1) {
			System.out.println(0);
			return;
		}
		
		for(int i = 0; i < t-1; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		while(!pq.isEmpty() && pq.peek() >= dasom ) {
			dasom++;
			cnt++;
			pq.add(pq.poll() - 1);
		}
		System.out.println(cnt);
		
	}

}

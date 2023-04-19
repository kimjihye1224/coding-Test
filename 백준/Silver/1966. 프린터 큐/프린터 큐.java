import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int k = Integer.parseInt(br.readLine());
		
		while(k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int count = 0;
			Queue<int[]> que = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				que.add(new int[] {i, Integer.parseInt(st.nextToken())});
			}
			
			
			while(!que.isEmpty()) {
				int[] arr = que.poll();
				boolean check = true;
				
				//우선 순위 더 높은 거 있나 체크.
				for(int[] q : que) {
					if(q[1] > arr[1]) {
						 check = false;
						 break;
					}
				}
				
				if(check) { // 현재 뽑은 친구가 제일 우선순위 높은 친구
					count++;
					if(arr[0] == m) break;
				}else { // 우선 순위 더 큰 숫자 존재하면 다시 뒤에 넣기.
					que.add(arr);
				}
			}
			
			System.out.println(count);
		}

	}

	
}
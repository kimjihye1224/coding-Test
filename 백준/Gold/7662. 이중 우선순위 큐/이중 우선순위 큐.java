import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		
		while(t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				String order = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				if(order.equals("I")) {
					tmap.put(n, tmap.getOrDefault(n, 0)+1);
				}else {
					if(tmap.isEmpty()) continue;
					
					if(n == -1) {
						int min = tmap.firstKey();
						if(tmap.get(min) == 1)
							tmap.remove(min);
						else
							tmap.put(min, tmap.get(min)-1);
					}
					else if(n == 1) {
						int max = tmap.lastKey();
						if(tmap.get(max) == 1)
							tmap.remove(max);
						else
							tmap.put(max, tmap.get(max) - 1);
					}
				}
			}
			 
			if(tmap.isEmpty())
				sb.append("EMPTY\n");
			else
				sb.append(tmap.lastKey() + " " + tmap.firstKey() + "\n");
			
			tmap.clear();
		}
		
		System.out.println(sb);
		
	}



}

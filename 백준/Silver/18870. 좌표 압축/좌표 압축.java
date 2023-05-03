import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] original = new int[n];
		int[] sorted = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			original[i] = sorted[i] = Integer.parseInt(st.nextToken());	
		}
		
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> map = new HashMap();
		
		int rank = 0;
		for(int v : sorted) {
			if(!map.containsKey(v)) {
				map.put(v, rank);
				rank++;
			}
		}
		
		for(int v : original) {
			sb.append(map.get(v)).append(" ");
		}
        System.out.print(sb);
	}



}

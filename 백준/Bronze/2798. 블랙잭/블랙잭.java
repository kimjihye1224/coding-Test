import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
 		
		int sum = 0;
		for(int i = 0; i < card.length - 2; i++) {
			for(int j = i+1; j < card.length - 1; j++) {
				for(int k = j+1; k < card.length; k++) {
					int s = card[i] + card[j] + card[k];
					if(s <= m) {
						sum = Math.max(sum, s);
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}
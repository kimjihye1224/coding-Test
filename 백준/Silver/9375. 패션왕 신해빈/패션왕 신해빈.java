import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			HashMap<String, Integer> cloth = new HashMap();
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String type = st.nextToken();
				cloth.put(type, cloth.getOrDefault(type, 0)+1);
				
			}
			
			int result = 1;
			for(int v : cloth.values()) {
				result *= (v + 1);
			}
			cloth.clear();
			
			System.out.println(result - 1);
		}
	}

}

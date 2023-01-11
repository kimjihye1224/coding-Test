import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> nega = new ArrayList<>();
		List<Integer> posi = new ArrayList<>();
		
		int N = 0;
		for(int i = 0; i < n; i++) {
			N = Integer.parseInt(br.readLine());
			if(N > 0) posi.add(N);
			else	nega.add(N);
		}
		
		Collections.sort(posi, Collections.reverseOrder());
		Collections.sort(nega);
		
		int sum = 0;
		int i = 0;
		
		while(i < posi.size()) {
			if(i + 1 < posi.size() && posi.get(i) != 1 && posi.get(i+1) != 1)
				sum += posi.get(i++) * posi.get(i++);
			else
				sum += posi.get(i++);
		}
		
		i = 0;
		while (i < nega.size()) {
			if (i + 1 < nega.size() && nega.get(i) != 1 && nega.get(i + 1) != 1)
				sum += nega.get(i++) * nega.get(i++);
			else
				sum += nega.get(i++);
		}
		
		System.out.println(sum);
		
		
	}

}

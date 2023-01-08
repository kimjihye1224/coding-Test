import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		int[] num = new int[10];
		int total = 0;
		
		for(int i = 0; i < n.length(); i++) {
			int temp = Integer.parseInt(n.substring(i, i+1));
			num[temp] += 1;
			total += temp;
		}
		
		if(n.contains("0") && total % 3 == 0) {
			for(int i = 9; i>= 0; i--) {
				while(num[i] > 0) {
					System.out.print(i);
					num[i]--;
				}
			}
		}else {
			System.out.println(-1);
		}
		
	}

}

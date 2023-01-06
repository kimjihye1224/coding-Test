import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		for(int i = n-1; i >= 0; i--) {
			if(coin[i] > money)
				continue;
			
			result += money / coin[i];
			money = money % coin[i];
		}
		
		System.out.print(result);
		
	}
}
    

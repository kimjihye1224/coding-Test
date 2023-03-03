import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	private static final int[] d = new int[3001];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int[] coin = new int[2];
    	
    	for(int i = 0; i < n; i++) {
    		coin[i] = Integer.parseInt(br.readLine());
    	}
    	
    	int[] d = new int[m+1];
    	Arrays.fill(d, 10001);
    	d[0] = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = coin[i]; j <= m; j++) {
    			if(d[j - coin[i]] != 10001) {
    				d[j] = Math.min(d[j], d[j - coin[i]+1]);
    			}
    		}
    	}
    	
    	if(d[m] == 1001) System.out.println(-1);
    	else System.out.println(d[m]);
    	   		
    	
    }
       

}

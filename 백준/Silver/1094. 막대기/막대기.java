import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	private static final int[][] dp = new int[31][31];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int x = Integer.parseInt(st.nextToken());
    	int stick = 64;
    	int result = 0;
    	
    	while(stick > 0) {
    		
    		if(stick > x) stick /= 2;
    		else {
    			result++;
    			x -= stick;
    		}
    	}
    	System.out.println(result);
    	
    		
    	
    }

    
    
       
    

}
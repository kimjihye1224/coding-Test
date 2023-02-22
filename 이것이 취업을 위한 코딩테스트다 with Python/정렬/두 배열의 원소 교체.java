import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[] a = new int[n];
    	Integer[] b = new Integer[n];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		a[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		b[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	
    	Arrays.sort(a);
    	Arrays.sort(b, Collections.reverseOrder());
    	
    	for(int i = 0; i < k; i++) {
    		if(a[i] < b[i])
    			a[i] = b[i];
    		else
    			break;
    	}
    	
    	System.out.print(IntStream.of(a).sum());
    }
}

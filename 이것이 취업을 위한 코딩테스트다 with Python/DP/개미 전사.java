import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	private static final int[] d = new int[3001];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	int[] d = new int[100];
    	
    	int[] array = new int[n];
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		array[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	d[0] = array[0];
    	d[1] = Math.max(array[0], array[1]);
    	for(int i = 2; i < n; i++) {
    		d[i] = Math.max(d[i-1], d[i-2] + array[i]);
    	}
    	
    	System.out.println(d[n-1]);
    	
    }    

}

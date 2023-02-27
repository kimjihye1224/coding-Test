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
    	
    	int ax = Integer.parseInt(st.nextToken());
    	int ay = Integer.parseInt(st.nextToken());
    	int bx = Integer.parseInt(st.nextToken());
    	int by = Integer.parseInt(st.nextToken());
    	int cx = Integer.parseInt(st.nextToken());
    	int cy = Integer.parseInt(st.nextToken());
    	
    	
    	if((ay - by) * (ax - cx) == (ax-bx) * (ay - cy))
    		System.out.println("-1");
    	else{
    		double ab = Math.sqrt(Math.pow((ax - bx),2) + Math.pow((ay-by),2));
        	double bc = Math.sqrt(Math.pow((bx - cx),2) + Math.pow((by-cy),2));
        	double ac = Math.sqrt(Math.pow((ax - cx),2) + Math.pow((ay-cy),2));
        	
        	double[] length = new double[3];
        	length[0] = ab + bc;
        	length[1] = bc + ac;
        	length[2] = ab + ac;
        	
        	Arrays.sort(length);
        	
            System.out.println(2 * (length[2] - length[0]));
    	}
    }

    
    
       
    

}
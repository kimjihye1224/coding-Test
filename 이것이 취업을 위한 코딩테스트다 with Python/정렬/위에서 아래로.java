import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	Integer[] arr = new Integer[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	
      //만약 Integer array가 아니고 int[] 였음 Collections.reverseOrder() 사용 안됨. 
    	Arrays.sort(arr, Collections.reverseOrder());
    	
    }
}

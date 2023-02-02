import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int[] n = new int[3];
        n[0] = Integer.parseInt(st.nextToken());
        n[1] = Integer.parseInt(st.nextToken());
        n[2] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(n);
        
        
        System.out.println(n[0] + " " + n[1] + " " + n[2]);
	}

}

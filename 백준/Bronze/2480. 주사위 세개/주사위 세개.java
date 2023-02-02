import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int d3 = Integer.parseInt(st.nextToken());
        
        int result = 0;
        if((d1 == d2) && (d2 == d3)) {
        	result = 10000 + d1 * 1000;
        }else if((d1 == d2) || (d1 == d3) ) {
        	result = 1000 + d1 * 100;
        }else if(d2 == d3) {
        	result = 1000 + d2 * 100;
        }else {
        	result = Math.max(Math.max(d1, d2), d3) * 100;
        }

        System.out.println(result);
	}

}

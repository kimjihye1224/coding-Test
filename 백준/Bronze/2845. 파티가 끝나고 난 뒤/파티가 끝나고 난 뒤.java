import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int w = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < 5; i++) {
        	int n = Integer.parseInt(st.nextToken());
        	sb.append((n - w)+ " ");
        }
        
        System.out.println(sb.toString());
	}

}

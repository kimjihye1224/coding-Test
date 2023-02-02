import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int n = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i <= n; i++){
            String s = br.readLine();
            sb.append(i + ". " +s  +'\n');
        }
       
        System.out.print(sb.toString());
        
	}

}

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        

        for(int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
        
        
		
		
		
	}

}

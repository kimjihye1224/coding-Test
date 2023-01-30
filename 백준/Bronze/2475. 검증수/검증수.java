import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int result = 0;
        
        for(int i = 0; i < 5; i++) {
        	int a = Integer.parseInt(st.nextToken());
        	result += a * a;
        }
        
		System.out.println(result % 10);
		
		
	}

}

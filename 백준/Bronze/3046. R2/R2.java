import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int s1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        System.out.println(s * 2 - s1);
	}

}

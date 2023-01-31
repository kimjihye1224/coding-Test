import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
         
        int[] student = new int[31];
        
        for(int i = 1; i <= 28; i++) {
        	st = new StringTokenizer(br.readLine());
        	student[Integer.parseInt(st.nextToken())]++;
        }
        
        for(int i = 1; i <= 30; i++) {
        	if(student[i] != 1)
        		System.out.println(i);

        }
        
	}

}

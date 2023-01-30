import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        char[] alpha = st.nextToken().toCharArray();
        
        for(char s : alpha) {
        	if(s >= 65 && s <= 90) {
        		s = (char)((int)s + 32);
        	}
        	else if(s >= 97 && s <= 122) {
        		s = (char)((int)s - 32);
        	}
        	sb.append(s+"");
        		
        }
		System.out.println(sb);
		
		
	}

}

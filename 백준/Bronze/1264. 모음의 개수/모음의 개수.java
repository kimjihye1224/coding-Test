import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int count = 0;
        while(true) {
        
        	String centences = br.readLine();
        	
        	if(centences.equals("#")) break;
        
        	char[] centence = centences.toLowerCase().toCharArray(); 
        	
        	for(char c : centence) {
        		if(c == 'a' || c == 'e' || c== 'i' || c== 'o' || c== 'u')
        			count++;
        	}
        	
        	System.out.println(count);
            count = 0;
        }
        
	}

}

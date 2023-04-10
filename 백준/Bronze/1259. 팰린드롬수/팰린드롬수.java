import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			boolean result = true;
			
			if(s.equals("0"))	break;
			
			for(int i = 0; i < s.length() / 2; i++) {
				if(s.charAt(i) == s.charAt(s.length() - i - 1)) continue;
				else {
					result = false;
					break;
				}
			}
			
			if(result)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}
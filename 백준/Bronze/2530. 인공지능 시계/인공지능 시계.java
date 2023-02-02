import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //      StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        int nS = Integer.parseInt(br.readLine());
        
        s += nS % 60;
        m += nS / 60;
        
        if(s >= 60) {
        	m += s / 60;
        	s %= 60;
        }
        
        if(m >= 60) {
        	h += m / 60;
        	m %= 60;
        }
        
        h %= 24;
        
        System.out.println(h + " " + m + " " + s);
	}

}

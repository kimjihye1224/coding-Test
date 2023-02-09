import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        
        for(int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine());
        	int sh = Integer.parseInt(st.nextToken());
        	int sm = Integer.parseInt(st.nextToken());
        	int ss = Integer.parseInt(st.nextToken());
        	int eh = Integer.parseInt(st.nextToken());
        	int em = Integer.parseInt(st.nextToken());
        	int es = Integer.parseInt(st.nextToken());

            int start = (sh*3600)+(sm*60)+ss;
            int end = (eh*3600)+(em*60)+es;
            int t = end - start;
            int h = t/3600;
            int m = (t%3600)/60;
            int s = (t%3600)%60;
        	System.out.println(h + " " + m + " " + s);
        	
        }
        
	}

}

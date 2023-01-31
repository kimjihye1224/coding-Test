import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //      StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] chess = {1,1,2,2,2,8};
        int[] c = new int[6];
        
        for(int i = 0; i < 6; i++) {
        	c[i] = Integer.parseInt(st.nextToken());
        }
       
		for(int i = 0; i < 6; i++) {
			System.out.print((chess[i] - c[i]) + " ");
		}
	}

}

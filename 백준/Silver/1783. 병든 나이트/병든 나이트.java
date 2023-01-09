import java.io.*;
import java.util.*;

public class Main{
     public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         
         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());
         
         int result = 0;
         if(n == 1) result = 1;
         else if(n == 2) result = Math.min(4, (m+1)/2);
         else if(m < 7) result = Math.min(4, m);
         else result = m - 2;
         
         System.out.print(result);
     }
}
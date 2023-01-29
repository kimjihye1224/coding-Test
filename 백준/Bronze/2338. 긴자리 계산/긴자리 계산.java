import java.util.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //   StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        
		System.out.println(a.add(b) +"\n" + a.subtract(b) + "\n" + a.multiply(b));
		
		
	}

}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        int b1 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());
        int b3 = Integer.parseInt(br.readLine());
        int coka = Integer.parseInt(br.readLine());
        int soda = Integer.parseInt(br.readLine());
        
        int bMin = Math.min(b1, Math.min(b2, b3));
        int dMin = Math.min(coka, soda);
        
        System.out.print(bMin + dMin - 50);
        
	}

}

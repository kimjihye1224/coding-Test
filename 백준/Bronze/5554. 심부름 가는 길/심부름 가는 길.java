import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int s = 0;
        for(int i = 0; i < 4; i++) {
        	s += Integer.parseInt(br.readLine());
        }
        
        System.out.println(s / 60);
        System.out.print(s % 60);

        
	}

}

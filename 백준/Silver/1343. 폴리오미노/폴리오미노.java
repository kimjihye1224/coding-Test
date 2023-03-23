import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		String answer = "";
		
		s = s.replaceAll("XXXX", "AAAA");
		answer = s.replaceAll("XX", "BB");
		
		if(answer.contains("X"))
			answer = "-1";
		
		
		System.out.println(answer);
	}

}

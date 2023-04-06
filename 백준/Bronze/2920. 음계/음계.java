import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] piano = new int[8];
		String result="";
		
		for(int i = 0; i < 8; i++) {
			piano[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 7; i++) {
			if(piano[i] + 1 == piano[i+1])	result = "ascending";
			else if(piano[i] - 1 ==  piano[i+1]) result = "descending";
			else {
				result = "mixed";
				break;
			}
		}
		
		System.out.println(result);
		
		
	}
}
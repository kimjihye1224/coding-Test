import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] list = new int[10];
		String[] s = br.readLine().split("");
		
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(Integer.parseInt(s[i]) == 6) list[9]++;
			else list[Integer.parseInt(s[i])]++;
		}
		
		if(list[9] % 2 == 0)
			list[9] = list[9] / 2;
		else
			list[9] = list[9] / 2 + 1;
		
		Arrays.sort(list);
		System.out.println(list[list.length-1]);

	}

}
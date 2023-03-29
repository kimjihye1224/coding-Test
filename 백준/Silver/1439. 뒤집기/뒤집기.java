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

		String s = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s, "0");
		StringTokenizer st2 = new StringTokenizer(s, "1 ");
		
		System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
	}
}
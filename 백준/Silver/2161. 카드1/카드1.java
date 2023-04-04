import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() != 1) {
			System.out.print(q.poll() + " ");
			q.add(q.poll());
		}
		
		System.out.println(q.poll());
	}

}
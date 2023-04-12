import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			String order = st.nextToken();
			
			if(order.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			else if(order.equals("top")) {
				if(stack.size() == 0)
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
			else if(order.equals("size"))
				System.out.println(stack.size());
			else if(order.equals("empty")) {
				if(stack.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}else {
				if(stack.size() == 0)
					System.out.println(-1);
				else
					System.out.println(stack.pop());
			}
		}
		
	}

}
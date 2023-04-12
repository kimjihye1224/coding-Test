import java.io.*;
import java.util.*;

public class Main {

	static int[] stack;
	static int index = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		stack = new int[n];
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			
			}
			
		}
		
		System.out.println(sb);
	}
	
	public static void push(int x) {
		stack[index++] = x;
	}
	
	public static int pop() {
		if(index != 0) {
			int x = stack[index - 1];
			stack[index-1] = 0;
			index--;
			return x;
		}
		
		return -1;
	}
	
	public static int size() {
		
		return index;
	}
	
	public static int top() {
		if(index != 0) {
			return stack[index -1 ];
		}
		return -1;
	}
	
	public static int empty() {
		if(index == 0)
			return 1;
		return 0;
	}
}
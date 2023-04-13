import java.io.*;
import java.util.*;

public class Main {

	static int[] deq = new int[1001];
	static int first = 0;
	static int last = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		int[] number = {-2, 3, 0, 2, -5};
//		int count = 0;
//		StringBuilder sb = new StringBuilder();
//		System.out.println();

//		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (deque.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(deque.pollFirst()).append('\n');
				}
				break;
			case "pop_back":
				if (deque.isEmpty()) {
					sb.append(-1).append('\n');
				} 
				else {
					sb.append(deque.pollLast()).append('\n');
				}
				break;
			case "size":
				sb.append(deque.size()).append('\n');
				break;
			case "empty":
				if (deque.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
			case "front":
				if (deque.peek() != null)
					sb.append(deque.peek()).append('\n');
				else
					sb.append(-1).append('\n');
				break;
			case "back":
				if (deque.peekLast() != null)
					sb.append(deque.peekLast()).append('\n');
				else
					sb.append(-1).append('\n');
			}
		}
		System.out.println(sb);
	}

}
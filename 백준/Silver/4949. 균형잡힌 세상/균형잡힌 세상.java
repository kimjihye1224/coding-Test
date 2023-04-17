import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Character> arr = new Stack<>();
		while(true) {
			String sentence = br.readLine();
			if(sentence.equals(".")) break;
			
			boolean check = true;
			for(int i = 0; i < sentence.length(); i++) {
				char c = sentence.charAt(i);
				
				if(c == '(' || c == '[') {
					arr.add(c);
				}
				else if(c == ')') {
					if(arr.isEmpty() || arr.pop() != '(') {
						check = false;
						break;
					}
				}else if(c == ']') {
					if(arr.isEmpty() || arr.pop() != '[') {
						check = false;
						break;
					}
				}
			}
			
			if(!arr.isEmpty())
				check = false;
			
			if(check)
				System.out.println("yes");
			else
				System.out.println("no");
			
			arr.clear();
		}
	}
	
}
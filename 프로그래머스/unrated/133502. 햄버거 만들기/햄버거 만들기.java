import java.io.*;
import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
		Stack<Integer> st = new Stack<>();
		int count = 0;
		
		for(int i = 0; i < ingredient.length; i++) {
			st.push(ingredient[i]);
			int size = st.size();
			
			if(size > 3 && st.peek() == 1 
			&& st.get(size - 2 )== 3
			&& st.get(size - 3) == 2
			&& st.get(size - 4) == 1) {
				st.pop();
				st.pop();
				st.pop();
				st.pop();
				count++;
			}
		}
		
        return count;
    }
}
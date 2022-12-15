import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
    	Stack<Character> st = new Stack<>();
    	
    	for(int i = 0; i<s.length(); i++) {
    		if(s.charAt(i) == '(') 
    			st.push('(');
    		else {
    			if(st.empty())
    				return false;
    			st.pop();
    			
    		}
    	}
    	
    	if(!st.empty()) return false;
        return answer;
    }
}
import java.io.*;
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        		ArrayList<Integer> li = new ArrayList<>();
		String[] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			li.add(Integer.parseInt(str[i]));
		}
		
		answer = Collections.min(li) + " " + Collections.max(li);
        return answer;
    }
}
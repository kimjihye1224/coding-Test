import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(String s) {
        		int[] answer = new int[s.length()];
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.indexOf(s.charAt(i)) == i)	{
				answer[i] = -1;
			}
			else {
				answer[i] = i - map.get(s.charAt(i)+"");
			}
			map.put(String.valueOf(s.charAt(i)), i);

		}
        return answer;
    }
}
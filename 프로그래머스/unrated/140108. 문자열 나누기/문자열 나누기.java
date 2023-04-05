import java.io.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0, diff = 0;
		char c = s.charAt(0);
		for(int i = 0; i < s.length(); i++) {
			if(count == diff) {
				answer++;
				c = s.charAt(i);
			}
			
			if(s.charAt(i) == c) count++;
			else diff++;
		}
        return answer;
    }
}
import java.io.*;
import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(n % 3);
			n /= 3;
			
		}
		
		int result = 0;
		for(int i = 0; i < sb.length(); i++) {
			result += (sb.charAt(sb.length() - (i+1)) - '0') * Math.pow(3, i);
		}
        return result;
    }
}
import java.io.*;
import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
	int result = 0;
	    
	//바로 0021로 구해짐. 
	while(n > 0) {
		sb.append(n % 3);
		n /= 3;		
	}
		
	//return Integer.parseInt(a,3); 로 바로 구할 수 있음. 
	for(int i = 0; i < sb.length(); i++) {
		result += (sb.charAt(sb.length() - (i+1)) - '0') * Math.pow(3, i);
	}
        return result;
    }
}

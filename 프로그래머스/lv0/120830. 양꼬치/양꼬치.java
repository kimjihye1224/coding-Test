import java.util.*;
import java.io.*;
class Solution {
    public int solution(int n, int k) {	
		if(n >= 10) {
			k = k - (n / 10);
			if(k < 0)
				k = 0;
		}
		
        
        return n * 12000 + k * 2000;
    }
}
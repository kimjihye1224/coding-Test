
import java.io.*;
import java.util.*;

class Solution {
    public int solution(String t, String p) {
		int count = 0;

		Long ip = Long.parseLong(p);
		for(int i = 0; i < t.length()-p.length()+1; i++) {
			Long n = Long.parseLong(t.substring(i, i+p.length()));
			if(n <= ip) {
                count++;
            }
		}
        return count;
    }
}
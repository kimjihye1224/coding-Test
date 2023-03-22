import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        		List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
		List<String> list2 =  new ArrayList<>(Arrays.asList(cards2));
		
		String answer="Yes";
		for(String s : goal) {
			int i1 = list1.indexOf(s);
			int i2 = list2.indexOf(s);
			
			if(i1 != -1 && i1 == 0)	{
				list1.remove(i1);
			}else if(i2 != -1 && i2 == 0) {
				list2.remove(i2);
			}else { 
				answer = "No";
			}
			
		}
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
   	    int[] workD = new int[speeds.length];
    	for(int i = 0; i < speeds.length; i++) {
            workD[i]  = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0)	workD[i]  += 1;
    	}
    	
    	List<Integer> list = new ArrayList<>();
    	int value = workD[0];
    	int count = 1;
    	for(int i = 1; i < speeds.length; i++) {
    		if(value >= workD[i])
    			count++;
    		else {
    			list.add(count);
    			count = 1;
    			value = workD[i];
    			
    		}

    	}
        list.add(count);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
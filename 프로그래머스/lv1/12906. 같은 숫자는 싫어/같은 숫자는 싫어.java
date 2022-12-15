import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
    	ArrayList<Integer> al = new ArrayList<>();
    	
    	int value = -1;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] != value) {
    			al.add(arr[i]);
    			value = arr[i];
    		}
    	}

        return al.stream().mapToInt(i->i).toArray();
    }
}
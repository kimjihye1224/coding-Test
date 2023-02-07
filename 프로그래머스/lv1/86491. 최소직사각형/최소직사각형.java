import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
                
        List<Integer> li1 = new ArrayList<Integer>(); //가로
        List<Integer> li2 = new ArrayList<Integer>(); //세로
        
        for(int[] size : sizes) {
        	if(size[0] < size[1]) {
        		li1.add(size[1]);
        		li2.add(size[0]);
        		
        	}else {
        		li1.add(size[0]);
        		li2.add(size[1]);
        	}
        }
        
        Collections.sort(li1);
        Collections.sort(li2);
        
        answer = li1.get(li1.size() - 1) * li2.get(li2.size() - 1);
        return answer;
    }
}
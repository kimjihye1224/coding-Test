import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder());
        String[] str;
        
        for(String s : operations) {
        	str = s.split(" ");
        	String o = str[0];
        	int number = Integer.parseInt(str[1]);
        	
        	if(o.equals("I")) {
        		q.offer(number);
        		maxq.offer(number);
        		
        	}else {
        		if(!q.isEmpty()) {
        			if(number == -1) {
        				int min = q.poll();
        				maxq.remove(min);
        			}else {
        				int max = maxq.poll();
        				q.remove(max);
        			}
        		}	
        	}
        	
        }
        
        if(!q.isEmpty()) {
        	answer[0] = maxq.poll();
        	answer[1] = q.poll();
        }else {
        	answer[0] = 0;
        	answer[1] = 0;
        }
        return answer;
    }
}
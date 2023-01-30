import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
    	int answer = 0;
    	
    	PriorityQueue<Integer> q = new PriorityQueue<>();
        
    	for(int n : scoville){
    		q.offer(n);
        }
        
        int count = 0;
        
        while(q.peek() < K) {
            if(q.size() == 1) return -1;
            
        	q.offer( q.poll() + (q.poll() * 2));
        	answer++;
        	
        }
        
    	return answer;
    }
}
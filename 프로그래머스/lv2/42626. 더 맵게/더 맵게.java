import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
    	int answer = 0;
    	
    	PriorityQueue<Integer> q = new PriorityQueue<>();
    	for(int n : scoville)
    		q.add(n);
    	
    	while(q.peek()<=K) {
    		if(q.size() == 1) return -1;
    		
    		int a = q.poll();
    		int b = q.poll();
    		
    		int result = a + (b * 2);
    		
    		q.offer(result);
    		answer++;
    	}
    	return answer;
    }
}
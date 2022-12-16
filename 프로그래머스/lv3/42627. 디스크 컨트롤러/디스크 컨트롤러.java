import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
    	int answer = 0;
    	int count = 0; //처리된 디스크
    	int end = 0; //작업 완료 시점 
    	 
    	//2차원 배열 요청 시간 기준 오름차순 정렬.
    	Arrays.sort(jobs, ((a, b) -> a[0]-b[0]));
    	
    	//queue 소요시간 기준 오름차순 정렬.  
    	PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[1] - b[1]);
    	
    	int i = 0;
    	while(count < jobs.length) {
    		
    		while(i < jobs.length && jobs[i][0] <= end) {
    			q.add(jobs[i++]);
    		}
    		
    		
    		if(q.isEmpty()) end = jobs[i][0];
    		else {
    			int[] tmp = q.poll();
    			
    			answer += tmp[1] + end - tmp[0];
    			end += tmp[1];
    			count++;
    		}
    	}
    	
    	return answer/ jobs.length;
    }
}
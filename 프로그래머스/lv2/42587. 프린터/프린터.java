import java.util.*;
 
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
     
     //우선순위 큐에 큰 숫자부터 담기.
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int n : priorities)
            queue.offer(n);
 
        while(!queue.isEmpty()) {
         //큐의 맨 첫번째 숫자와(현 가장 큰 수)와 원래 배열 돌면서 비교.
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                 //같은 숫자인데 찾고자하는 해당 인덱스라면 답.
                    if(location == i) 
                        return answer;
                 //같은 숫자지만 찾는 인덱스가 아니라면 순서 증가. 
                    answer++;
                    queue.poll();
                }
            }
        }
 
        return answer;
    }
}

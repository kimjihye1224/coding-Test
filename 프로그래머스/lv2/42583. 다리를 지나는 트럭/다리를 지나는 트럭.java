import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> cross = new LinkedList<>();
        
        for(int t : truck_weights){
            while(true){
                if(cross.isEmpty()){
                    cross.offer(t);
                    sum+= t;
                    answer++;
                    break;
                }else{
                    if(cross.size() == bridge_length){
                        sum -= cross.poll();
                    }else if(sum + t > weight){
                        cross.offer(0);
                        answer++;
                    }else{
                        answer++;
                        cross.offer(t);
                        sum += t;
                        break;
                    }
                    
                    
                }
            }
        }
        return answer + bridge_length;
    }
}
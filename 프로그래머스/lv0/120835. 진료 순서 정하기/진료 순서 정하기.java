import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int n : emergency){
            li.add(n);
        }
        
        Collections.sort(li, Collections.reverseOrder());
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.indexOf(emergency[i]) + 1;
        }
        return answer;
    }
}
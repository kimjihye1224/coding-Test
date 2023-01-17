import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] st = String.valueOf(order).split("");
        
        for(String s : st){
            if(s.equals("3") || s.equals("6") || s.equals("9"))
                answer++;
        }
        
        return answer;
    }
}


return (int)Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();

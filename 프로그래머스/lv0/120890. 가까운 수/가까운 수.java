import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 10000;
        for(int a : array){
            int m = Math.abs(a - n);
            
            if( m < min){
                min = m;
                answer = a;
            }
            if(m == min)
                answer = Math.min(answer, a);
                
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int price) {
        double percent = 0;
        
        if(price >= 500000)
            percent = (double)20 / 100;
        else if(price >= 300000)
            percent = (double)10 / 100;
        else if(price >= 100000)
            percent = (double)5 / 100;
    
        return (int)(price * (1-percent));
    }
}
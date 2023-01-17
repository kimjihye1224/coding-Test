import java.util.*;

class Solution {
    public int solution(int num, int k) {
        String[] st = String.valueOf(num).split("");        
        String n = String.valueOf(k);
        
        for(int i = 0; i < st.length; i++){
            if(st[i].equals(n))
                return i + 1;
        }
        return -1;
    }
}


//return ("-" + num).indexOf(String.valueOf(k));

import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] st = s.split("");
        Arrays.sort(st);
        int count = 0;
        for(int i = 0; i < st.length; i++){
            count = 0;
            for(int j = 0; j < st.length; j++){
                if(st[i].equals(st[j]))
                    count++;
            }
            
            if(count == 1){
                answer += st[i];
            }
        }

        return answer;
    }
}
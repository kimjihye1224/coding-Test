import java.util.*;
import java.io.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] le = letter.split(" ");
        
        for(String m : le){
            for(int i = 0; i< morse.length; i++){
                if(m.equals(morse[i]))
                    answer += Character.toString('a' + i);
            }
        }
        return answer;
    }
}
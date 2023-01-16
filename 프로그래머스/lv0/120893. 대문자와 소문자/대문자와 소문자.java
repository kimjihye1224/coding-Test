import java.util.*;
class Solution {
    public String solution(String my_string) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        
        for(int i = 0; i < my_string.length(); i++){
            c = my_string.charAt(i);
            if(c >= 65 && c <= 90) sb.append((char)(c + 32));
            if(c >=97 && c <= 122)   sb.append((char)(c - 32));
        }
        return sb.toString();
    }
}
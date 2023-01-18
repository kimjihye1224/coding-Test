import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> li = new ArrayList();
        
        for(int i = 0; i < my_string.length(); i++){
            if( !li.contains(String.valueOf(my_string.charAt(i))))
                li.add(String.valueOf(my_string.charAt(i)));
        }
        return String.join("", li);
    }
}
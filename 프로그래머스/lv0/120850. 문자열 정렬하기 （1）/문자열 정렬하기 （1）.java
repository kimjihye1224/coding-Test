import java.util.*;
class Solution {
    public int[] solution(String my_string) {
 		StringBuilder st = new StringBuilder();
        st.append("");
        for(int i = 0; i < my_string.length(); i++){
           char c = my_string.charAt(i);

            if((int)c >= 48 &&	(int)c <= 57)
                st.append(c);
        }
        my_string = st.toString();
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
        	answer[i] = my_string.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
        //return Arrays.strem(array.replaceAll("[A-Z|a-z]","").split("").sorted().mapToInt(Integer::parseInt).toArray();
    }
}

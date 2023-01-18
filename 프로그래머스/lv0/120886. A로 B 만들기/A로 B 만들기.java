import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        String bS = new String(b);
        String aS = new String(a);
        
        if(bS.equals(aS))
            answer = 1;
        
        return answer;
    }
}
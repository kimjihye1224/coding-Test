class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] s = my_string.split(" ");
        int i = 0;
        while(i < s.length){
            
            if(s[i].equals("+"))
                answer += Integer.parseInt(s[++i]);
            else if(s[i].equals("-"))
                answer -= Integer.parseInt(s[++i]);
            else
                answer = Integer.parseInt(s[i]);
            i++;
        }
        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        		for(int i = 0; i < my_string.length();i++) {
			int s = my_string.charAt(i) - '1' + 1;
			if(s < 10) answer +=s;
			
		}
        return answer;
    }
}
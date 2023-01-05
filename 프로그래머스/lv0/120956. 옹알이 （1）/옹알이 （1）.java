class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        boolean sign = true;
        
        for(String ba: babbling) {
        	sign = true;
        	for(String word : words) {
        		ba = ba.replace(word, "?");
        	}
        	
        	for(int j = 0; j <ba.length(); j++) {
        		if(ba.charAt(j) != '?') {
        			sign = false;
        		}
        	}
        	if(sign == true)
        		answer++;
        }
        
        return answer;
    }
}
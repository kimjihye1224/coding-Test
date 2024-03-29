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
        
        
        /*
          for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }
        
        */
        
        /*
               for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        */
        return answer;
    }
}

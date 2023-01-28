class Solution {
    public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int wait = 0, price = 0;
		
		for(int i = 0; i < prices.length-1; i++) {
			wait = 0;
			price = prices[i];
			for(int j = i+1; j < prices.length; j++ ) {
				wait++;
				if(price > prices[j]) break;
			}
			answer[i] = wait;
		}
		
		answer[prices.length-1] = 0;
        return answer;
    }
}
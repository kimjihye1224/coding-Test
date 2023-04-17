class Solution {
    public int[] solution(int[] sequence, int k) {
        		int length = sequence.length;
		int start = 0;
		int last = length;
		
		int sum = 0;
		
		for(int s = 0, l = 0; s < length; s++) {
			while(l < length && sum < k) {
				sum += sequence[l++];
			}
			
			if(sum == k) {
				int range = l - s - 1;
				if((last - start) > range) {
					start = s;
					last = l - 1;
				}
			}
			
			sum -= sequence[s];
		}
		int[] answer = {start, last};
        return answer;
    }
}
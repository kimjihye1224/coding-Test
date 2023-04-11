class Solution {
    public long solution(int price, int money, int count) {
		long answer = 0;
		for(int i = 0; i < count; i++) {
			answer += price * (i+1);
		}
		if(answer <= money) answer = 0;
		else
			answer -= money;

        return answer;
    }
}
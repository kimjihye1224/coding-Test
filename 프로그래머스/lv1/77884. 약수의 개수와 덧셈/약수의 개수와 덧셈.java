class Solution {
    public int solution(int left, int right) {
		int result = 0;
		for(int i = left; i <= right; i++) {
			if(measure(i) % 2 == 0)
				result += i;
			else
				result -= i;
		}
        return result;
    }
    public static int measure(int n) {
		
		int count = 0;
		for(int i = 1; i<= Math.sqrt(n); i++) {
			if(i * i == n)
				count +=1;
			else if(n % i == 0)
				count +=2;
			
		}
		return count;
	}
}

/*

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}



*/

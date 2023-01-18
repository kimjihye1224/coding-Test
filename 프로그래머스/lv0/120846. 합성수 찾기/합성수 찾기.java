class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while(n > 3){
            count = 0;
            for(int i = 1; i <= n ; i++ ){
                if(n % i == 0)  count++;
                if(count == 3){
                    answer++;
                    break;
                }
            }
            n--;
        }
        
        return answer;
    }
}
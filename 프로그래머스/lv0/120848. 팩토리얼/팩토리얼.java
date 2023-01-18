class Solution {
    int fact(int n){
        if(n <= 1) return 1;
        return n * fact(n-1);
    }
    
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i <= 10; i++){
            if(fact(i) <= n){
                answer = i;
            }
                
        }
        return answer;
    }
}
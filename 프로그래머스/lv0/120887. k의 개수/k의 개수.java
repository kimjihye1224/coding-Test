class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
       
        
        for(int l = i; l <= j; l++){
             char[] num = String.valueOf(l).toCharArray();
            for(int h = 0; h < num.length; h++){
                if(num[h] -'0'== k){
                    answer++;
                //    System.out.println(l);
                }
            }
          
        }
        return answer;
    }
}
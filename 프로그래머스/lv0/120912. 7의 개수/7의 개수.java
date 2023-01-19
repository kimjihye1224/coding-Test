class Solution {
    public int solution(int[] array) {
        String s = "";
        for(int n : array){
            s += n+"";
        }
        
        
        return s.length() - s.replace("7", "").length();
    }
}
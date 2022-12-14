import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
        	hm.put(nums[i], 0);
        }
        
        if(hm.size() > count)
        	answer = count;
        else
        	answer = hm.size();
        
        return answer;
    }
}
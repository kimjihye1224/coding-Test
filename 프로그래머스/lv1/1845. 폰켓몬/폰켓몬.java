import java.util.*;

class Solution {
    public int solution(int[] nums) {
       HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        return (nums.length / 2 > a.size()) ? a.size() : nums.length / 2;
    }
}

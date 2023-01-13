import java.util.*;

class Solution {
    public int solution(int n) {
        int sq = (int)Math.sqrt(n);
        return sq*sq == n ? 1 : 2;
    }
}
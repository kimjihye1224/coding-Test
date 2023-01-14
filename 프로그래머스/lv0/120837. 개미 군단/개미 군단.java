import java.util.*;

class Solution {
    public int solution(int hp) {
		int[] army = {5,3 , 1};
		
		int count = 0;
		for(int i = 0; i < 3; i++) {
			count += hp / army[i];
			hp %= army[i];
		}
        return count;
	//return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}

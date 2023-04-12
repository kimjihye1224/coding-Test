import java.io.*;
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < tangerine.length; i++) {
			int n = tangerine[i];
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		
		Object[] mapValue = map.values().toArray();
		Arrays.sort(mapValue, Collections.reverseOrder());
		
		int count = 0;
		for(int i = 0; i < mapValue.length; i++) {
			int v = Integer.parseInt(mapValue[i].toString());
			if(k > 0) {
				k -= v;
				answer++;
			}
			else
				break;
		}
        return answer;
    }
}
import java.io.*;
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        		Integer[] scoreA = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(scoreA, Collections.reverseOrder());

		int answer = 0;
		for(int i = 0; i < scoreA.length; i++) {
			if((i+1) % m == 0) answer += scoreA[i] * m;
		}
        return answer;
    }
}
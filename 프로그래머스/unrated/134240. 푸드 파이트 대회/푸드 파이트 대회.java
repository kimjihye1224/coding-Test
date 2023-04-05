import java.io.*;
import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < food.length; i++) {
			sb.append(String.valueOf(i).repeat(food[i] / 2));
		}
		answer += sb.toString() + "0" + sb.reverse();
        return answer;
    }
}
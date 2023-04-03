import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        		Map<String, Integer> album = new HashMap<>();
		
		for(int i = 0; i < name.length; i++) {
			album.put(name[i], yearning[i]);
		}
		
		int[] answer = new int[photo.length];
		
		for(int i = 0; i < photo.length; i++) {
			int sum = 0;
			for(int j = 0; j < photo[i].length; j++) {
				if(album.containsKey(photo[i][j]))
					sum += album.get(photo[i][j]);
			}
			answer[i] = sum;
		}
        return answer;
    }
}
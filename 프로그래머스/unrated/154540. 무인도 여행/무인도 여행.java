import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(String[] maps) {
        int[] answer = {};
        boolean[][] visit = new boolean[maps.length][maps[0].length()];
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < maps.length; i++) {
			int sum = 0;			
			for(int j = 0; j < maps[0].length(); j++) {
				sum = check(i,j,visit,maps);
				if(sum > 0) list.add(sum);
			}
		}
        
        Collections.sort(list);
        return list.isEmpty()?new int[]{-1}:list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    	public static int check(int i, int j, boolean[][] visit, String[] maps) {
		if(i < 0 || j < 0 || i >= visit.length || j >= visit[0].length 
				|| visit[i][j] || maps[i].charAt(j) == 'X')
			return 0;
		
		visit[i][j] = true;
		return (maps[i].charAt(j) - '0') 
		+ check(i-1,j,visit,maps)
		+ check(i+1,j,visit,maps)
		+ check(i,j-1,visit,maps)
		+ check(i,j+1,visit,maps);
	}
}
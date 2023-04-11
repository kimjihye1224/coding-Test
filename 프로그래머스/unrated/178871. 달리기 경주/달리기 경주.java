import java.io.*;
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		for(int i = 0; i < callings.length; i++) {
			int idx = map.get(callings[i]);
			
			String original = players[idx];
			String change = players[idx - 1];
			players[idx] = change;
			players[idx - 1] = original;
			
			map.put(change, idx);
			map.put(original, idx - 1);
		}
        return players;
    }
}
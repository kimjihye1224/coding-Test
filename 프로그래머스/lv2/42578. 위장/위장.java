import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
    	for(String[] cloth : clothes)	hm.put(cloth[1], hm.getOrDefault(cloth[1], 1)+1);
        for(String key : hm.keySet()) {
            System.out.print(hm.get(key));
            answer *= hm.get(key);
        }   
        return answer-1;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        
        int n1C = 0, n2C = 0, n3C = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == n1[i % n1.length])
        		n1C++;
        	if(answers[i] == n2[i % n2.length])
        		n2C++;
        	if(answers[i] == n3[i % n3.length])
        		n3C++;
        }
        
        int max = Math.max(n1C, Math.max(n2C, n3C));
        
        List<Integer> li = new ArrayList<>();
        if(max == n1C) li.add(1);
        if(max == n2C) li.add(2);
        if(max == n3C) li.add(3);
        return li.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
    
        
        int l = 0;
        for(int[] command : commands) {
        	int i = command[0];
        	int j = command[1];
        	int k = command[2];
        	
        	int[] arr = Arrays.copyOfRange(array, i-1, j);
        	Arrays.sort(arr);
        	answer[l++] =arr[k-1];   
        }
        
        return answer;
    }
}


import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
        	int[] a = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	Arrays.sort(a);
        	answer[i] = a[commands[i][2] - 1];
        }
        
        return answer;
    }
}

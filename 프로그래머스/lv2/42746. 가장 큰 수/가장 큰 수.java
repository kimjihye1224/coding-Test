import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
       String[] arr = new String[numbers.length];
       
/*       for (int i=0; i<nums.length; i++) 
            nums[i] = numbers[i] + "";*/
       for(int i = 0; i < numbers.length; i++){
           arr[i] = String.valueOf(numbers[i]);        
       }
       
       Arrays.sort(arr, new Comparator<String>(){
           @Override
            public int compare(String n1, String n2) {
                return (n2+n1).compareTo(n1+n2);
            }
        });
       
       for(int i = 0; i < arr.length; i++)
           answer += arr[i];
        
       if(answer.charAt(0) == '0')
    	   answer = "0";
       
        return answer;
    }
}

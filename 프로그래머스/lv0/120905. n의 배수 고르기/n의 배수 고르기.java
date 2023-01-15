import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0)
                arrayList.add(num);
        }
    
        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
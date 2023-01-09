class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String st : strlist){
            answer[i++] = st.length();
        }
        return answer;
    }
}
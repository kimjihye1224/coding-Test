class Solution {
    public long solution(String numbers) {

        String[] alph = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < alph.length; i++){
            numbers = numbers.replace(alph[i], i+"");
        }

        return Long.parseLong(numbers);
    }
}
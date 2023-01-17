class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j'};
		
		String a = String.valueOf(age);
		for(int i = 0; i < a.length(); i++) {
			sb.append(alpha[Character.getNumericValue(a.charAt(i))]);
		}
        return sb.toString();
    }
}
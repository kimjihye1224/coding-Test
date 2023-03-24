import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
                int tYear = Integer.parseInt(today.split("[.]")[0]);
        int tMonth = Integer.parseInt(today.split("[.]")[1]);
        int tDay = Integer.parseInt(today.split("[.]")[2]);
        
        int cnt = (tYear * 12 * 28) + (tMonth * 28) + tDay;
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < privacies.length; i++) {
        	String s = privacies[i];
        	
        	String privacie = s.split(" ")[0]; //계약 날짜
        	String term = s.split(" ")[1]; //약관 종류 
        	int month = 0; //약관 달
        	
        	for(int j = 0; j < terms.length; j++) {
        		if(terms[j].contains(term)) {
        			month = Integer.parseInt(terms[j].split(" ")[1]);
        			break;
        		}
        	}
        	
        	//계약한 날 달;
        	int pYear = Integer.parseInt(privacie.split("[.]")[0]);
        	int pMonth = Integer.parseInt(privacie.split("[.]")[1]);
        	int pDay = Integer.parseInt(privacie.split("[.]")[2]);
        	
        	pMonth += month;
        	int tCnt = (pYear * 12 * 28) + (pMonth * 28) + pDay - 1;
        	
        	if(cnt > tCnt)
        		answer.add(i + 1);
        	
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
}
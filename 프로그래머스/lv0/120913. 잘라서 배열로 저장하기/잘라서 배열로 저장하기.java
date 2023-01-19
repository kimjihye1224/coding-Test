import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        
     	if(my_str.length() % n == 0) {
			length = my_str.length() / n;
		} else {
			length = my_str.length() / n + 1;
		}
        
        String[] answer = new String[length];
        
        	String[] split_arr = my_str.split("");
		
		// 나머지를 구하기 위한 변수
		int diff = my_str.length();
		
		// 나머지를 더할때의 경우 접근하기 위한 변수
		int count = 0;
		
		while(true) {
			// 나머지가 주어진 칸 수 (n)보다 작으면 break;
			if(diff < n) break;
			
			// diff를 n으로 지속적으로 차감 = (my_str.length() % n)와 같은 맥락
			diff -= n;
			count++; 
		}

		
		for(int i = 0; i < length ; i++) {
			// answer의 인덱스 별 저장해줄 임시 저장소 선언
			String save = "";
			
			// i가 마지막 나머지 원소들에 접근할 시점이 되면
			if(i == count) { 
				// 초기값은 주어진 칸 수 (n)에서 count만큼 곱해진것에서 시작
				// 기존 문자열 길이의 끝까지 반복
				for(int k = n*count; k < my_str.length(); k++) {
					save += split_arr[k];
				}
				answer[i] = save;
				
				break; // i에 대한 for반복문을 종료시킴
			}
			
			// 그 외의 경우
			// 초기값은 0*n = 0 부터 해서 n의 배수로 증가
			// 범위지정은 갱신되는 j값을 기준으로 +n 인 값
			for(int j = i*n; j < i * n + n ; j++) {
				save += split_arr[j];
			}
			answer[i] = save;
		}
        
        return answer;
    }
}
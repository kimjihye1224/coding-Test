/*
- 전형적인 이진 탐색 문제이자 파라메트릭 서치 유형의 문제
    - 파라메트릭 서치 : 최적화 문제를 결정 문제로 바꾸어 해결하는 기법
    - 주로 원하는 조건을 만족하는 가장 알맞은 값을 찾는 문제에 주로 사용
- 절단기의 높이(탐색 범위)는 1 ~ 10억까지의 정수 중 하나. → 이진 탐색 떠올리기
*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	private static final int[][] dp = new int[31][31];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int[] arr = new int[n];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i]= Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	//1e9 = 1*109 = 1000000000
    	int start = 0;
    	int end = arr[n-1];
    	int result = 0;
    	
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // 잘랐을 때의 떡의 양 계산
                if (arr[i] > mid) total += arr[i] - mid; 
            }
            if (total < m) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid - 1;
            }
            else { // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록 
                start = mid + 1;
            }
        }

        System.out.println(result);
    	
    	
    	   	
    }
}

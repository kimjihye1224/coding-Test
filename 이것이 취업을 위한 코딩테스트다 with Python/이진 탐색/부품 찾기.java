import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

//이진 탐색 방법
public class Main {
	public static int binary(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target)	start = mid + 1;
			else	end = mid - 1;
			
		}
		return -1;
	}
	
	

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//현재 있는 부품 받기
    	int n = Integer.parseInt(br.readLine());
    	int[] b = new int[n];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		b[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(b);
    	
    	//고객이 요구하는 부품 리스트
    	int m = Integer.parseInt(br.readLine());
    	int[] c = new int[m];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < m; i++) {
    		c[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	
    	for(int i = 0; i < m; i++) {
    		int answer = binary(b, c[i], 0, n-1);
    		if(answer == -1)
    			System.out.print("NO ");
    		else
    			System.out.print("Yes ");
    	}
    	
    	
    }
}


//계수 정렬
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//총 있는 부품 받기
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[1000001];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		int x = Integer.parseInt(st.nextToken());
    		arr[x] = 1;
    	}
    	
    	//고객이 요구하는 부품 리스트
    	int m = Integer.parseInt(br.readLine());
    	int[] c = new int[m];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < m; i++) {
    		c[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//찾기
    	for(int i = 0; i < m; i++) {
    		if(arr[c[i]] == 1)
    			System.out.print("Yes ");
    		else
    			System.out.print("No ");
    	}

    	
    	
    }


//집합 자료형 (HashSet 사용)
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//총 있는 부품 받기
    	int n = Integer.parseInt(br.readLine());
    	HashSet<Integer> hs = new HashSet<>();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) { 
    		hs.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	//고객이 요구하는 부품 리스트
    	int m = Integer.parseInt(br.readLine());
    	int[] c = new int[m];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < m; i++) {
    		c[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//찾기
    	for(int i = 0; i < m; i++) {
    		if(hs.contains(c[i]))
    			System.out.print("Yes ");
    		else
    			System.out.print("No ");
    	}

    	
    	
    }



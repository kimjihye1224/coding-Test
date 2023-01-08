import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;

	//여학생 + 남학생의 수에서 팀으로 묶인 3명을 뺀 값이 인턴쉽으로 빠질 인원보다 크거나 같아야 팀 가능.
        while(n>=2 && m>=1 && m+n-3 >=k){
            n = n-2;
            m= m-1;
            count++;
        }
        System.out.println(count);
		
		
	}

}

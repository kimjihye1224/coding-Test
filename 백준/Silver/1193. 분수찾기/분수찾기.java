import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int x = Integer.parseInt(br.readLine());
    	
    	int line = 0;
    	int cnt = 0;
    	
    	while(cnt < x) {
    		line++;
    		cnt = line * (line + 1) / 2;
    	}
    	
    	if(line % 2 == 1) {
    		int top = 1 + (cnt - x);
    		int bottom = line - (cnt - x);
    		System.out.println(top + "/" + bottom);
    	}else {
    		int top = line - (cnt - x);
    		int bottom = 1 + (cnt - x);
    		System.out.println(top + "/" + bottom);
    	}
    }
}



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}

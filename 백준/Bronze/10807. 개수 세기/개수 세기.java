import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int[] number = new int[n];
		for(int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		
		int findN = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(findN == number[i])
				count++;
		}
		System.out.print(count);
	}
}

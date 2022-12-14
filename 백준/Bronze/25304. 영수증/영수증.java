import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int money, m, result = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			money = sc.nextInt();
			m = sc.nextInt();
			
			result += money * m;
		}
		
		if(result == count)
			System.out.print("Yes");
		else
			System.out.print("No");
		
	}
}
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		
		String a = br.readLine();
	
		for(int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i));
			if(i != 0 && i % 10 == 9)
				System.out.print("\n");
		}
		
	}

}


//풀이2
int leng = a.length();

for(int i = 0; i < leng/10; i++){ //10 간격으로 끊으므로 총 몇 덩어리?
	System.out.println(a.substring(i*10, (i+1) * 10);
}

//남은 거 출력
System.out.print(a.substring(i/10)*10);

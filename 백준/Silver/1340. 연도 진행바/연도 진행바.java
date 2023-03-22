import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static List<String> months = Arrays.asList("", "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December");
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int month = months.indexOf(st.nextToken());
		int day = Integer.parseInt(st.nextToken().split(",")[0]);
		int year = Integer.parseInt(st.nextToken());
		String[] TIME = st.nextToken().split(":");
		int hour = 60 * Integer.parseInt(TIME[0]);
		int minute = Integer.parseInt(TIME[1]);
		int time = hour + minute;
		
		//윤년 구하기
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
			days[2] = 29;
		
		int count = 0;
		for(int i = 1; i < month; i++) {
			count += days[i];
		}
		count += day;
		
		//전날까지의 총 시간 
		int timeTohour = 60 * 24 * (count - 1) + time;
		
		int total  = days[2] == 28 ? 365 * 60 * 24 : 366 * 60 * 24;
		
		System.out.println((double)timeTohour * 100 / (double)total);

		
		
	}

}

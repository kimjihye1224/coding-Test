import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
	
	static int[] dayArray(int year) {
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			day[1] = 29;
		return day;
	}
	
	static int findDays(int year, int month, int day) {
		int days = 0;
		int[] date;
		for(int i = 1; i < year; i++) {
			date = dayArray(i);
			for(int j = 0; j < 12; j++) {
				days += date[j];	
			}
		}
		date = dayArray(year);
		for(int i = 0; i < month-1; i++) {
			days += date[i];
		}
		days += day;
		return days;
	}

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//오늘 날짜 입력 	받기
    	st = new StringTokenizer(br.readLine());
    	int tYear = Integer.parseInt(st.nextToken());
    	int tMonth = Integer.parseInt(st.nextToken());
    	int tDay = Integer.parseInt(st.nextToken());
    	
    	//끝나는 날
    	st = new StringTokenizer(br.readLine());
    	int eYear = Integer.parseInt(st.nextToken());
    	int eMonth = Integer.parseInt(st.nextToken());
    	int eDay = Integer.parseInt(st.nextToken());
    	
    	//gg인 경우
    	if((eYear - tYear > 1000) || (eYear - tYear == 1000 && eMonth > tMonth) 
    			|| (eYear - tYear == 1000 && eMonth == tMonth && eDay >= tDay))
    		System.out.println("gg");
    	else {
    		int tFindDays = findDays(tYear, tMonth, tDay);
    		int eFindDays = findDays(eYear, eMonth, eDay);
    		System.out.println("D-" + (eFindDays - tFindDays));
    	}
    		

    
    }
    

}
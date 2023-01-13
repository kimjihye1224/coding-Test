import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] plans = br.readLine().split(" ");
		
		int x = 1, y = 1;
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		
		System.out.println(plans.length);
		for(int i = 0; i < plans.length ; i++) {
			int index = 0;
			
			if(plans[i].equals("L"))	index = 0;
			if(plans[i].equals("R"))	index = 1;
			if(plans[i].equals("U"))	index = 2;
			if(plans[i].equals("D"))	index = 3;
			
			int nx = x + dx[index];
			int ny = y + dy[index]; 
			
			if( (nx <= n && nx >= 1)  && (ny <= n && ny >= 1)) {
				x = nx;
				y = ny;
				System.out.println(x + " " + y);
			}
				
		}
		
		System.out.print(x + " " + y);
	}

}
----------------------------------------------------------------------------------------
  import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            // 이동 후 좌표 구하기 
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행 
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }

}

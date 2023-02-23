import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int result;
		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			result = 1;
			for (int j = 0; j < n; j++) {
				result = result * (m - j) / (j + 1);
			}
			System.out.println(result);

		}
	}
	
	
//2번째 풀이	
    private static final int[][] dp = new int[31][31];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < t; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int n = Integer.parseInt(st.nextToken());
    		int m = Integer.parseInt(st.nextToken());
    		
    		System.out.println(combination(m,n));
    		
    	}
    	
    	
    }
    
    public static int combination(int n, int r)
    {
    	if(dp[n][r] > 0)
    		return dp[n][r];
    	else if(n == r || r == 0)
    		return dp[n][r] = 1;
    	else
    		return combination(n-1, r-1) + combination(n-1,r);
    	
    }

}
    
    
    
  

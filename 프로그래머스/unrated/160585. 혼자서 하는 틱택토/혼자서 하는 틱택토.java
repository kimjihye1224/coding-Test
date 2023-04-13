
import java.io.*;
class Solution {
    static char[][] map = new char[3][3];
    public int solution(String[] board) {
        int answer = 1;
        		int oCount = 0;
		int xCount = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				map[i][j] = board[i].charAt(j);
				if(map[i][j] == 'O') oCount++;
				if(map[i][j] == 'X') xCount++;
			}
		}
		
		if(xCount > oCount || oCount - xCount > 1 )
			return 0;
		if(win('O') > 0 && win('X') > 0)
			return 0;
		if(win('O') > 0) {
			if(oCount == xCount)
				return 0;
		}
		if(win('X') > 0) {
			if(oCount > xCount)
				return 0;
		}
		
        return answer;
    }
    
    	public static int win(char c) {
		int game = 0;
		
		for(int i = 0; i < 3; i++) {
			// 가로 성공 
			if(map[i][0] == c && map[i][0] == map[i][1] && map[i][1] == map[i][2])
				game++;
			
			//세로 성공 
			if(map[0][i] == c && map[0][i] == map[1][i] && map[1][i] == map[2][i])
				game++;
		}
		
		//오른쪽 아래로 대각선 성공
		if(map[0][0] == c && map[0][0] == map[1][1] && map[1][1] == map[2][2])
			game++;
		//왼쪽 아래로 대각선 성공
		if(map[0][2] == c && map[0][2] == map[1][1] && map[1][1] == map[2][0])
            game++;
		
		return game;		
	}
}
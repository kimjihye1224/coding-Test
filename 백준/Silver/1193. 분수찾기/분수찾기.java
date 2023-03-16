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
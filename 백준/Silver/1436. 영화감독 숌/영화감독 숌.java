import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int num = 666, cnt = 1;
        
        while(n != cnt) {
        	num++;
        	
        	if(String.valueOf(num).contains("666"))
        		cnt++;
        }
        
        System.out.println(num);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s : br.readLine().split("")) {
        	pq.add(Integer.parseInt(s));
        }
        
        while(!pq.isEmpty()) {
        	System.out.print(pq.poll());
        }
    }
}
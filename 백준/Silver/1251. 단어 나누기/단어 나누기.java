import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
	
	static ArrayList<String> list = new ArrayList<>();
	static String word;

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	word = br.readLine();
    	
    	for(int i = 1; i < word.length()-1; i++) {
    		for(int j = i+1; j < word.length(); j++) {
    			list.add(getReverse(i, j));
    		}
    	}
    	
    	Collections.sort(list);
    	System.out.println(list.get(0));
    
    }
    
    private static String getReverse(int a, int b) {
    	StringBuilder sb = new StringBuilder();
    	StringBuilder s1 = new StringBuilder(word.substring(0, a));
    	StringBuilder s2 = new StringBuilder(word.substring(a,b));
    	StringBuilder s3 = new StringBuilder(word.substring(b));
    	
    	sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());
    	return sb.toString();
    }
}
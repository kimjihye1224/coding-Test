import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	private static final int[] d = new int[3001];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	String[] li = new String[n];
    	
    	for(int i = 0; i < n; i++) {
    		li[i] = br.readLine();
    	}
    	
    	Arrays.sort(li, new Comparator<String>() {
    		public int compare(String s1, String s2) {    			
    			if(s1.length() == s2.length()) {
    				return s1.compareTo(s2);
    			}
    			else {
    				return s1.length() - s2.length();
    			}
    		}
    	}
    	);
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(li[0] + "\n");
    	
    	for(int i = 1; i < n; i++) {
    		
    		if(!li[i].equals(li[i-1])) {
    			sb.append(li[i]+"\n");
    		}
    	}
    	
    	System.out.println(sb);
    	    	
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++)
			arr[i] = br.readLine();
		
		Arrays.sort(arr, (o1, o2) -> {
			return o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length();
		});
		
		System.out.println(arr[0]);
		for(int i=1; i<n; i++)
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		
		br.close();
	}
}

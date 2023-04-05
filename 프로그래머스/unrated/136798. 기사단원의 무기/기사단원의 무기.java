import java.io.*;
import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        		int sum = 0;
		for(int i = 1; i <= number; i++) {
            int p = prime(i);
			if(p <= limit)
				sum+=p;
			else
				sum += power;
		}
        return sum;
    }
    	static int prime(int n) {
		int count = 0;
		for(int i = 1; i * i<= n; i++) {
            if(i * i == n) count += 1;
			else if(n % i == 0)
				count +=2;
		}
		return count;
				
	}
}
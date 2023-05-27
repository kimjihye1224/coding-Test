import java.io.*;
import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
		String[] list = s.toLowerCase().split("");
		
		boolean space = true;
		for(String ss : list) {
			sb.append(space ? ss.toUpperCase() : ss);
			space = ss.equals(" ") ? true : false;
		}
        return sb.toString();
    }
}
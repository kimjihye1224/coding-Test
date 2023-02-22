import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student implements Comparable<Student>{
	
	public String name;
	public int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}

	@Override
	public int compareTo(Student o) {
		if(this.score > o.score)
			return 1;
		
		return -1;
	}
	
}

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	List<Student> li = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++) {
    		String[] s = br.readLine().split(" ");
    		li.add(new Student(s[0], Integer.parseInt(s[1])));
    	}
   
    	Collections.sort(li);
    	
    	for(int i = 0; i < li.size(); i++) {
    		System.out.println(li.get(i).getName());
    	}
    	
    }
}

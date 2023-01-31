import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String jae = (new StringTokenizer(br.readLine()).nextToken());
        String doctor = (new StringTokenizer(br.readLine()).nextToken());
        
        int jaeL = jae.length() - jae.replace("a", "").length();
        int doctorL = doctor.length() - doctor.replace("a", "").length();
        
        if(jaeL >= doctorL)
        	System.out.println("go");
        else
        	System.out.println("no");
        
        
        
	}

}

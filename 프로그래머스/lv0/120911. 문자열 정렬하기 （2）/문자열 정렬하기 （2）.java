import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] st = my_string.toLowerCase().toCharArray();
        Arrays.sort(st);
        return String.valueOf(st);
    }
}

//return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());

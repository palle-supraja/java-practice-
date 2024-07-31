package Anudip;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingNumber {

	    public static int findFirstNonRepeatedCharacter(String s) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        for (char c : s.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        for (int i = 0; i < s.length(); i++) {
	            if (charCountMap.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }

	        // If no non-repeated character is found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        int result = findFirstNonRepeatedCharacter("aabb");
	        System.out.println(result);
	    
	}

}

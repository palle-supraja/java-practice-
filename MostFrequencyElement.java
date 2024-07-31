package Anudip;
import java.util.HashMap;
import java.util.Map;
public class MostFrequencyElement {
	
	    public static int findMostFrequentElement(int[] nums) {
	        Map<Integer, Integer> countMap = new HashMap<>();
	        
	        for (int num : nums) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        int mostFrequentElement = nums[0];
	        int maxCount = 0;

	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                mostFrequentElement = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return mostFrequentElement;
	    }

	    public static void main(String[] args) {
	        int[] input = {1, 3, 2, 2, 5, 2, 3, 4, 1, 1};
	        int result = findMostFrequentElement(input);
	        System.out.println(result);
	    }
	}


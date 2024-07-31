package Anudip;
import java.util.*;
public class TopKElement {
	public static List<String> topKFrequent(String[] words, int k) {
	      
	        Map<String, Integer> countMap = new HashMap<>();
	        for (String word : words) {
	            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
	        }

	        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
	            int f1 = countMap.get(w1);
	            int f2 = countMap.get(w2);
	            if (f1 == f2) {
	                return w2.compareTo(w1);
	            }
	            return f1 - f2; // Sort by frequency
	        });

	        for (String word : countMap.keySet()) {
	            heap.offer(word);
	            if (heap.size() > k) {
	                heap.poll();
	            }
	        }

	        List<String> result = new ArrayList<>();
	        while (!heap.isEmpty()) {
	            result.add(heap.poll());
	        }
	        Collections.reverse(result);

	        return result;
	    }

	    public static void main(String[] args) {
	        String[] words = {"i", "love", "coding", "i", "love", "MyCountry"};
	        int k = 2;
	        List<String> result = topKFrequent(words, k);
	        System.out.println(result); // Output: ["i", "love"]
	    }
	}


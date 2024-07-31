package AdvJava;
import java.util.LinkedHashSet;
public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hm = new LinkedHashSet<Integer>();
		hm.add(4);
		hm.add(3);
		hm.add(2);
		hm.add(4);
		hm.add(1);
		hm.add(3);
		hm.add(2);
		System.out.println("After remove duplicates while maintaining the insertion order " +hm);
	}

}

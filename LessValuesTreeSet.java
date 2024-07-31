package Anudip;

import java.util.TreeSet;
public class LessValuesTreeSet {
	   
	 static int value=4;
	public static void main(String[] args) {
		TreeSet<Integer> al = new TreeSet<>();
		al.add(3);
		al.add(9);
		al.add(2);
		al.add(1);
		al.add(8);
		al.add(7);
		al.add(0);
		System.out.println("before treeset "+al);
		 al.tailSet(value+1).clear();
	  System.out.println("After remove all elements from a TreeSet that are greater than a specified element "+al);	 
	}
}


package AdvJava;

import java.util.HashSet;
public class RepeatArrayElement {
	
	public void hashlist()
	{
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(6);
		System.out.println("After deleting duplicates from list the final list is "+hs);
	}
	public static void main(String[] args) {
		RepeatArrayElement rae = new RepeatArrayElement();
		rae.hashlist();
	}
}

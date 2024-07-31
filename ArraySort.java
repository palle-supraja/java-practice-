package javaPractiece;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySort {
	
		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			al.add(5);
			al.add(2);
			al.add(0);
			al.add(20);
			al.add(9);
			System.out.println("ArrayList before sort:"+al);
			Collections.sort(al);
			System.out.println("ArrayList after sort:"+al);

		}

	}	




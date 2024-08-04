package Anudip;

import java.util.*;
public class ReversesWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String str = sc.nextLine();		
		String[] temp=str.split(" ");
		String rev="";
		for(int i=temp.length-1;i>=0;i--)
		{
			rev =rev+ temp[i]+ " ";
		}
		rev.trim();
		System.out.println("After revers sentence is: " +rev);
	}

}

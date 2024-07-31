package javaPractiece;

import java.util.StringTokenizer;

public class ReverseString {
	
	public static void main(String args[])
	{
		String name = "anudip Foundation";
		StringTokenizer st = new  StringTokenizer(name);
		String reverse = " ";
		while(st.hasMoreTokens())
		{
			reverse = st.nextToken()+ " "+reverse;
		}
		System.out.println("Reverse String is\n " +reverse);	
	}
}


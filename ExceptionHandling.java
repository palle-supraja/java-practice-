package javaPractiece;

import java.util.Arrays;
public class ExceptionHandling {

	public static void main(String[] args) //throws ArrayIndexOutOfBoundsException,ArithmeticException
	{
		int ar[]= {1,2,3,4,5,6};
		
		try {
		
			int x= ar[7];
			System.out.println(ar[x]);

			int a=2/0;
		}
		catch(ArrayIndexOutOfBoundsException aq) {
			
			System.out.println("I am ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException ae) {
			System.out.println("Don't Enter Zero in Denominator");
		}
	}

}
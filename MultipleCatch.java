package javaPractiece;

public class MultipleCatch {
	public static void main(String[] args) {

		int a=10,c;
		
		try {
			c=a/0;
		}
		catch(ArithmeticException ae){
			System.out.println("Don't Enter zero in Denominator");
		}
		catch(NullPointerException ie) {
			System.out.println("I am NullPointerException");
		}
		catch(Exception e) {
			System.out.println("I am exception block");
		}
		finally {
			System.out.println("I am finally block");
		}

	}


}

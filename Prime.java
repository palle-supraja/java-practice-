package javaPractiece;
import java.util.Scanner;
class Prime
{
	Prime(int num) //constructor with 1 parameter
   {
	 int count=0;
	for(int i=1;i<=num;i++)
	{
	   if(num%i==0)
		   
	   {
	        count++;	        
	   }
	}
	if(count==2)
	{
	       System.out.println("prime number ");
	}
	else
	{
	System.out.println("Not a prime number "); 
	}
   }
public static void main(String arg[])	
	{
	Scanner sc=new Scanner(System.in);
	Prime p= new Prime(3);
	}
   }

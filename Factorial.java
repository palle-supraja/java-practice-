import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a number to give factorial of it:--");

  int num=sc.nextInt();
 long fac=1;
for(int i=1;i<=num;i++)
{
  fac=fac*i;
}
System.out.println("factorial of " + num +  "is"  +fac);
}
}

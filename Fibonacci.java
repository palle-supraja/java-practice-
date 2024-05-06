import java.util.*;
class Fseries
{
public static void main(String args[])
{
 int a=0,b=1, c,n;
Scanner sc =new Scanner(System.in);
 System.out.println("enter requried numbers of fibonacci series:--");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
c=a+b;
System.out.print(a+ " ");
a=b;
b=c;

}
}
}

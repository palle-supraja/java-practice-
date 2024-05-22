class SumOfDigit
{
public static void main(String args[])
{
 int num=9876,sum=0,res=0;
while(num>0)
{
  sum=sum+num%10;
   num=num/10;
}
System.out.println(sum); 
while(sum>10)
{
  res=res+sum/10;
    sum=sum%10;
  
}

System.out.println(res);
}
}

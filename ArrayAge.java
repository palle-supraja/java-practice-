class Age1
{
public static void main(String args[])
{
int temp=0;
int[] arr = new int[] {16,9,5,3,14};
int yr[]=new int[5];

for(int i=0;i<5;i++)
{
  yr[i]=20-arr[i];
}
System.out.println("before");
for(int i=0;i<5;i++)
{
System.out.println(+yr[i]);
}

for(int i=0;i<5;i++)
{
for(int j=i+1;j<5;j++)
{
 if(yr[i]>yr[j])
{
temp=yr[i];
yr[i]=yr[j];
yr[j]=temp;
}
}
}
System.out.println("after sorting");
for(int i=0;i<5;i++)
{
System.out.println(""+yr[i]);
}
}

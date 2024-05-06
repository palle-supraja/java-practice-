import java.util.*;
class Array2D
{
public static void main(String args[])
{
  int matA[][]= new int[3][3];
  int matB[][]=new int[3][3];
  int matC[][]=new int[3][3];
Scanner sc = new Scanner(System.in);
System.out.println("enter matrics A values");
 for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    {
  	matA[i][j]=sc.nextInt();
}
}
System.out.println("matrics is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(matA[i][j]+"  ");
}
System.out.println();
}
 System.out.println("enter matrics B values");
 for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
    {
  	matB[i][j]=sc.nextInt();
}
}
System.out.println("matrics is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(matB[i][j]+"  ");
}
System.out.println();
}
System.out.println("additon matrics");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 matC[i][j]=matA[i][j]+matB[i][j];
  }
}
System.out.println("results");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
   System.out.print(matC[i][j]+ " ");
}
System.out.println();
}
}
}

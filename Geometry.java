import java.util.*;
class Geometry
{
public static void main(String args[])
{
     System.out.println("choose your option to perform");
  System.out.println(" 1. Calculate area of a rectangle\n 2. Calculate area of a circle\n 3. Calculate volume of a box\n 4. Exit \n");
     float pie=3.14f;
 Scanner sc = new Scanner(System.in);
if(sc.hasNextInt())
{
 int i=sc.nextInt();
if(i>0 && i<5)
{

 switch(i)
{
 case 1:
     System.out.println("enter length");
     int l=sc.nextInt();
     System.out.println("enter breath");
     int  b=sc.nextInt();
     int res=l*b;
     System.out.println("Area of rectangle:- " +res);
     break;
case 2:
     System.out.println("enter radius:");
      int r= sc.nextInt();
      float result=pie*r*r;
      System.out.println("Area of crcle:- "+result); 
      break;
case 3:
   System.out.println("enter length");
    int len=sc.nextInt();
   System.out.println("enter breath");
    int bre=sc.nextInt();
    System.out.println("enter height");
    int height=sc.nextInt();
     int vol= len*bre*height;
    System.out.println("Volume of box "+vol);
    break;   
case 4:
      System.out.println("thank you..!!");
} 
}
else
{
System.out.println("enterted invalid number");
System.out.println("choose a option from  1-4");
}
} 
}
}

package javaPractiece;

abstract class Shape{
	  
	  abstract double calculation();
	}

class Rectangle extends Shape
{
 public int l;
 public int w;
 public Rectangle(int l, int w)
 {
  this.l=l;
  this.w=w;
 }
 double calculation()
 {
  return l*w;
 }
}

public class Circle extends Shape {
	
     public int r;
	 public Circle(int r)
	 {
	  this.r=r;
	 }
	 double calculation()
	  {
	   return 3.14*r*r;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c= new Circle(10);
		 System.out.println("Area of Circle " +(c.calculation()));
		 Rectangle r= new Rectangle(10,5);
		 System.out.println("Area of Rectangle " +(r.calculation()));

	}

}

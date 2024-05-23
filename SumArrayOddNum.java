class SumArrayOddNum{
public static void main(String args[]){
   int sum=0;
   int arr[] = new int [] {2,-3,1,-8,-7,5};
  for( int i=0;i<arr.length;i++)
  { 
   if(arr[i]>0) //checking conditions for +ve,-ve Number.
    {
     if(arr[i]%2!=0) // checking condition for Odd Number.
     {
       sum=sum+arr[i]; // Adding +ve odd numbers.
      }
    }
  }
System.out.println("Sum of positive odd numbers in array is " +sum);
}
}


Output:-

  Sum of positive odd numbers in array is 6

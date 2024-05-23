import java.util.Scanner;
class TransposeMatrix{
public static void main(String args[]){
int r=3,c=4;
  Scanner sc = new Scanner(System.in);
System.out.println("enter values into Matrix:-");
   int arr[][]= new int [3][4];
      for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
         {
            arr[i][j]=sc.nextInt(); //entering values into matrix
         }
        }  

   System.out.println("Original matrixs:-");
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)   //loops for printing matrix
   {
  System.out.print(arr[i][j]+ " ");
  }
  System.out.println();
  }
 System.out.println("Transpose Matrix:-");
  for(int i=0;i<c;i++){
   for(int j=0;j<r;j++){
    System.out.print(arr[j][i]+ " "); //transpose logic
   }
   System.out.println();
  }
}
}
 Output:--
enter values into Matrix:-
1
2
3
4
5
6
7
8
9
0
1
2
Original matrixs:-
1 2 3 4
5 6 7 8
9 0 1 2
Transpose Matrix:-
1 5 9
2 6 0
3 7 1
4 8 2


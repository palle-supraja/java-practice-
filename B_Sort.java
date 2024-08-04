package Anudip;

import java.util.Arrays;
import java.util.Scanner;

public class B_Sort {
	
	public static void sort(int a[]) {
		int temp;
		for(int i =0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) {
					 temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("after " +Arrays.toString(a));		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter a array values : ");
		for(int i=0 ;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("before sort "+Arrays.toString(a));
		sort(a);

	}

}

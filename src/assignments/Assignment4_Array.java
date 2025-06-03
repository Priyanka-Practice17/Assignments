package assignments;

import java.util.Scanner;

public class Assignment4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int[10];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Print 10 numbers");
		
		for (int i=0;  i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		//	System.out.println("Entered numbers are" +a[i]);
		}
		
		for (int i=0;  i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		
		System.out.println("Average of 5th and 6th numbers are :" + ((a[4] +a[5])/2));
		sc.close();
		
	}

}

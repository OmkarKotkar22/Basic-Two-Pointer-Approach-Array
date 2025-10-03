/*Merge Two Sorted Arrays (No Extra Space)
Merge two sorted arrays in-place using the two-pointer method.*/

import java.util.*;
public class Merge_Two_Sorrted_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		//enter the size of array
		System.out.println("Enter the Size of First Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the Size of Second Array: ");
		size = sc.nextInt();
		int b[] = new int[size];

		int c[] = new int[a.length + b.length];

		//enter the value in array
		System.out.println("Enter the Elements in First Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		//enter the value in array
		System.out.println("Enter the Elements in Second Array: ");
		for(int i = 0; i < a.length; i++)
		{
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);

		//logic
		for(int i = 0, j = a.length; i < a.length; i++, j++)
		{
			c[i] = a[i];
			c[j] = b[i];
		}

		System.out.println("\nDisplay Merged Array\n");
		for(int i = 0; i < c.length; i++)
	  	{ 
			System.out.printf("%d\t",c[i]);
		}

	}
}
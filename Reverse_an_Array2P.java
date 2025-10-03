/*Reverse an Array In-Place
Reverse an array using the two-pointer technique.*/

import java.util.*;
public class Reverse_an_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
                int temp[] = new int[size];
		
		//enter the value in array
		System.out.println("Enter the values in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
                int j=0;
                for(int i = a.length-1; i >= 0; i--)
		{
			temp[j] = a[i];
			j++;
		}
                 for(int i = 0; i < temp.length; i++)
		{
			a[i] = temp[i];
		}

		System.out.println("Display Reverse Array: ");
                for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}	
	}
}
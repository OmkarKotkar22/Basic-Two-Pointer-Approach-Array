/*Find Intersection of Two Sorted Arrays
Return the intersection of two sorted arrays using two pointers.*/

import java.util.*;
public class Intersection_of_Two_Sorted_Array2P
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

		//enter the value of first array
		System.out.println("Enter the Values in First Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		//enter the value of second array
		System.out.println("Enter the Values in second Array: ");
		for(int i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
		}

		Arrays.sort(b);

		//logic
		int i = 0, j = 0;
		while(i < a.length && j < b.length)
		{
			if(a[i] == b[j])
			{
				System.out.println("Intersected Element: "+ a[i]);
				i++;
				j++;
			}
			else if(a[i] < b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}
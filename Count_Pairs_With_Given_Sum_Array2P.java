/*Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.*/

import java.util.*;

public class Count_Pairs_With_Given_Sum_Array2P 
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);

		// enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];


		// enter the value in array
 		System.out.println("Enter the Values in Array: ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}

		// enter the target value
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();

		Arrays.sort(a);  // sort for two pointer

		// Logic
 		int count = 0;
		int i = 0, j = a.length-1; 
		while(i < j) 
		{
			int sum = a[i] + a[j];

			if (sum == target) 
			{
				count++;
				System.out.println("[" + a[i] + ", " + a[j] + "]");

				i++;   // move left pointer
				j--;   // move right pointer
			} 
			else if (sum < target) 
			{
				i++;
			} 
			else 
			{
				j--;
			}
		}
	System.out.println("Total Pairs Found = " + count);
    }
}

/*Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.*/

import java.util.*;
public class Move_Zeros_to_End_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the value of array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{			
			a[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != 0)
			{
				a[j] = a[i];
				j++;
			}
		}
		
		//fill the blank place
		while(j < a.length)
		{
			a[j] = 0;
			j++;
		}

		//display the array
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}

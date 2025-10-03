/*Sort Colors (Dutch National Flag Problem)
Sort an array of 0s, 1s, and 2s using two/three pointers.*/


import java.util.*;
public class Sort_Colors_Dutch_National_Flag_2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter  the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		//enter the values in array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//logic
		int low = 0, mid = 0, high = a.length-1;
		while(mid <= high)
		{
			if(a[mid] == 0)
			{
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
			}
			
			else if(a[mid] == 1)
			{
				mid++;
			}

			else if(a[mid] == 2)
			{
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}
		
	//display the array
	for(int i = 0; i < a.length; i++)
	{
		System.out.print(a[i] + " ");
	}
		
	}
}
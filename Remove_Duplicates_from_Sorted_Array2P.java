/*Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.*/

import java.util.*;
public class Remove_Duplicates_from_Sorted_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the Size of Array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the value in array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		
		//logic
		int i = 0;
		for(int j = 0; j < a.length; j++)
		{
			if(a[j] != a[i])                    //i     j     a[i]   a[j]
			{
				i++;                        //0     0     1      1
				a[i] = a[j];                //0     1     1      1
			}                                   //0     2     1      2
		}                                           //1     3     2      3
                                                            //2     4     3      4
		int newLength = i + 1;                      //3     5     4

 		System.out.println("New length = " + newLength);

	}
}
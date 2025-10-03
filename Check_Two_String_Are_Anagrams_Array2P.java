/*Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.*/

import java.util.*;
public class Check_Two_String_Are_Anagrams_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		//enter the size of array
		System.out.println("Enter the Size of First Array: ");
		int size = sc.nextInt();

		//take a input String
		System.out.println("Enter the First String: ");
		String str1 = sc.next();

		//convert string in char
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		String sortedStr = new String(arr1);


		//enter the size of array
		System.out.println("Enter the Size of Second Array: ");
		size = sc.nextInt();

		//take a input String
		System.out.println("Enter the Second String: ");
		String str2 = sc.next();

		//convert string in char
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		sortedStr = new String(arr2);


		//logic
		boolean flag = true;
		for(int i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++)
		{
			if(arr1[i] != arr2[j])
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are Not Anagram");
		}
	}
}
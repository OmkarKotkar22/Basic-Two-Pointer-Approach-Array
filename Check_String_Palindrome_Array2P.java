/*Check Palindrome Using Two Pointers   ----> two pointer
Check if a string is a palindrome using the two-pointer approach.*/

import java.util.Scanner;
public class Check_String_Palindrome_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		//Define array size
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		//Take a Input
		String str = sc.next();

		//For ingore the case
		str = str.toLowerCase();

		//palindrome logic
		boolean flag = true;
		for(int left = 0, right = str.length()-1; left < right; left++, right--)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				flag = false;
				break;
			}
		}		
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
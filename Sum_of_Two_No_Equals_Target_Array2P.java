import java.util.Scanner;

public class Sum_of_Two_No_Equals_Target_Array2P
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Values in Array (sorted): ");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the Target Value: ");
		int target = sc.nextInt();

		int i = 0, j = a.length - 1;
		boolean found = true;

		while (i < j)
		{
			int sum = a[i] + a[j];

			if (sum == target)
			{
				System.out.println("Pair Found: [" + a[i] + ", " + a[j] + "]");
				found = false;
				break;
			}
			else if (sum < target)
			{
				i++; // need bigger sum → move left pointer right
			}
			else
			{
				j--; // need smaller sum → move right pointer left
			}
		}

		if (found)
		{
			System.out.println("Pair Not Found");
		}
	}
}

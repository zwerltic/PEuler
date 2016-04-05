// Jose TLacuilo
// Project Euler
// 2-9-2016
// Smallest multiple from 10 to 1 smallest is 2520
// search biggest and find the multiples once found devide al for that found digit.

import java.util.*;

public class PEulerSmallest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Smallest factor with largest number ? ");
		eulerSmallest(in.nextInt());
	}

	public static void eulerSmallest(int max)
	{
		int[] a = new int[max];
		for (int i = 0; i < max; i++)
		{
			a[i] = max - i;

		}
		printArray(a);
		for (int i = max - 1; i >= 0; i--)
		{
			a = factorizeSmall(a, i);
			printArray(a);
		}
		System.out.println("Result: " + findResult(a));
	}

	public static int[] factorizeSmall(int[] a,int i)
	{
		for (int j = i - 1; j >= 0; j--)
		{
			if (a[j] % a[i] == 0)
			{
				a[j] /= a[i];
			}
			printArray(a);
		}
		return a;
	}

	public static int findResult(int[] a)
	{
		int total = 1;
		for(int i = 0; i < a.length; i++)
		{
			total = total * a[i];
		}
		return total;
	}

	public static void printArray(int[] anArray) {
	      for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(anArray[i]);
	      }
	      System.out.println("");
   }


}
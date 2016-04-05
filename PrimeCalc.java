// Jose Tlacuilo
// PEuler Ex 7
// 10 001 st prime

import java.util.*;

public class PrimeCalc
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What prime do you want");
		numOfPrime(in.nextInt());
	}

	public static void numOfPrime(int x)
	{
		int nextP = 1;
		for(int i = 1; i <= x; i++)
		{
			nextP++;
			while (notPrime(nextP))
			{
				nextP++;
			}
			System.out.println("The " + i + " prime number is " + nextP);
		}
		System.out.println("The final number is: " + nextP);
	}

	public static boolean notPrime(int num)
	{
		boolean isntPrime = false;
		for (int i = 2; i < num; i++)
		{
			isntPrime = (num % i == 0);
			if (isntPrime)
			{
				return isntPrime;
			}
		}
		return isntPrime;
	}

}
// Zwerltic
// PEuler
// Summation of primes

import java.util.*;
import java.math.*;

public class SumPrimesBelow
{
	public static void main(String[] agrs)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Sum below: ");
		System.out.println(sumPrime(in.nextInt()).toString());
	}

	public static BigInteger sumPrime(int x)
		{
			BigInteger sum = new BigInteger("0");
			for(int i = x; i > 1; i--)
			{
				if (isPrime(i))
				{
					sum = sum.add(BigInteger.valueOf(i));
					System.out.println(i);
				}
			}
			return sum;
		}

		public static boolean isPrime(int num)
		{
			boolean isPrime = true;
			if (num %2 == 0 && num != 2)
			{
				return false;
			}
			for (int i = 3; i < num; i+=2)
			{
				isPrime = (num % i != 0);
				if (!isPrime)
				{
					return isPrime;
				}
			}
			return isPrime;
	}
}
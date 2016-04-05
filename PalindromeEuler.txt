// Zwerltic
// 02/02/2016
// Euler problem 3
// Palindrome numbers get the highest from two three digit factors

public class PalindromeEuler
{
	public static int factorOne;
	public static int factorTwo;

	public static void main(String[] args)
	{
		for(int i = 999*999; i > 0; i--)
		{
			System.out.println(i);

			if (findPalindrome(i))
			{
				if (findFactors(i))
				{
					System.out.println("Definitive: " + factorOne + "*" + factorTwo);
					return;
				}
			}
		}

	}



	public  static boolean findFactors(int numb)
	{
		for (int i = 999; i > 899; i--)
		{
			for (int j = 999; j > 899; j--)
			{
				System.out.println("Factors: " + i + "*" + j + " -- " + numb);
				if (i * j == numb)
				{
					System.out.println("YESSS YESS YESSS YESS YESSS frgergth.tr.ryj.tyj.tyj.tr.jryj.t.rt.u.ryj.ry.ry..");
					factorOne = i;
					factorTwo = j;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean findPalindrome(int numb)
	{
		char[] numberArr = ("" + numb).toCharArray();
		boolean isPalindrome = true;
		for (int i = 0; i < numberArr.length / 2; i++)
		{
			isPalindrome = isPalindrome && (numberArr[i] == numberArr[numberArr.length - 1 - i]);
		}
		return isPalindrome;
	}


}





























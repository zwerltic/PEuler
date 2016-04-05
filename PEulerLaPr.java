// Jose Tlacuilo
// PEuler
// Largest Product in a series
// Given requiered num of adjacent digits find the greatest product

import java.util.*;
import java.io.*;
import java.lang.*;

public class PEulerLaPr
{
	public static void main(String[] agrs) throws FileNotFoundException
	{
		File file = new File("1000dnumb.txt");
		Scanner frFile = new Scanner(file);
		Scanner in = new Scanner(System.in);
		System.out.println("How many digits do you want?");
		int res = in.nextInt();
		System.out.println(getProd(frFile, res));
	}

	public static int getProd(Scanner fle, int nDig)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int totProd = 1;
		String number = fle.nextLine();
		System.out.println(number + " " + number.length());
		int posArr = 0;
		System.out.println(list.size());
		for (int i = 0; i < number.length(); i++)
		{
			System.out.println(list);
			if (list.size() == 0)
			{
				posArr = 0;
				list.add(number.charAt(i) - '0');
			}
			System.out.println("Size: " + list.size());
			list.add(number.charAt(i) - '0');
			posArr++;
			if (list.size() == nDig)
			{
				System.out.println("Total Product is: " + totProd);
				totProd = Math.max(totProd, prodResult(list));
				list.remove(0);
			}
		}
		return totProd;

	}

	public static int prodResult(ArrayList<Integer> list)
	{
		int prod = 1;
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println("Factor is: " + list.get(i));
		 	prod *= list.get(i);
		}
		return prod;
	}

}
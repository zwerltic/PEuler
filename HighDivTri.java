// P Euler
// Jose Tlacuilo

public class HighDivTri
{
	public static void main(String[] args)
	{
		int c = 0;
		int numb = 0;
		int f = 0;
		while (f < 500)
		{
			c++;
			numb = numb + c;
			System.out.println("Tri: " + numb + "nInt: " + c);
			f = Math.max(f, findFactors(numb));
			System.out.println("f: " + f);	
		} 
	}

	public static int findFactors(int numb)
	{
		int res = 0;
		for (int i = 1; i <= numb; i++)
		{
			if (numb % i == 0)
			{	
				res++;
			}	
		} 
		return res;
	}
}
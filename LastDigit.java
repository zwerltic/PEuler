import java.util.*;
import javax.swing.JOptionPane;

public class LastDigit
{
	public static void main(String[] agrs)
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a number");
		System.out.println("LD: " + lst(in.nextInt()));
		int num = Integer.parseInt(JOptionPane.showInputDialog("Number:"));
		System.out.println("ld: " + lst(num));
	}
	
	public static int lst(int num)
	{
		while (num >= 10)
		{
			num = num / 10;
		}
		return num;
	}
}
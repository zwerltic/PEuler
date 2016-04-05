// Jose Tlacuilo
// 01-04-2016
// Recibe N numeros, regresa num de negativos

import javax.swing.JOptionPane;

public class Ej1
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de datos"));
		int c = 0;
		int[] ns = new int[n];
		for (int i = 0; i < n; i++)
		{	
			ns[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el " + (i + 1) + " numero"));
			if (ns[i] < 0) 
			{ 
				c++; 
			}
		}
		System.out.println("Numeros negativos: " + c);
	}
}
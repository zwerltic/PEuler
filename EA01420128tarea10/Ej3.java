// Jose Tlacuilo 
// 01-04-2016
// Recibe cadenas de caracteres,
// Regresa cuantas comienzan con letra dada

import javax.swing.JOptionPane;

public class Ej3
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Que numero de arreglos hay"));
		char l = JOptionPane.showInputDialog("Cual es la letra especial").charAt(0);
		String[] arrs = new String[n];
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			arrs[i] = JOptionPane.showInputDialog("El " + (i + 1) + " arreglo");
			if (arrs[i].charAt(0) == l)
			{
				c++;
			}
		}
		System.out.println("Hay " + c + " \"" + l + "\""); 
	}
}
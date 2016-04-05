// Jose Tlacuilo
// 01-04-2016
// Suaviza señal, recoje n valores
// regresa valores prom de ultimo y prim

import javax.swing.JOptionPane;

public class Ej4
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos valores?"));
		double[] v = new double[n];
		for (int i = 0; i < n; i++)
		{
			v[i] = Double.parseDouble(JOptionPane.showInputDialog("Dame el " + (i + 1) + " valor"));
		}
		double[] nv = new double[n];
		nv[0] = (v[0] + v[1]) / 2;
		for (int i = 1; i < n - 1; i++)
		{
			nv[i] = (v[i - 1] + v[i] + v[i + 1]) / 3;
		}
		nv[n - 1] = (v[n - 2] + v[n - 1]) / 2;
		System.out.println("Señal suavizada");
		for(int i = 0; i < n - 1; i++)
		{
			System.out.print(nv[i] + ", ");
		}
		System.out.println(nv[n - 1]);
	}
}
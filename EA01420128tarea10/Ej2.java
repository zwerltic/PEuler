// Jose Tlacuilo
// 01-04-2016
// Recibe ventas, por venta recibe total y dia, 
// Regresa ventas por dia

import javax.swing.JOptionPane;

public class Ej2
{
	public static void main(String[] args)
	{
		double[] dia = new double[7];
		char ans = 'y';
		System.out.println("Iniciando recuento de ventas");
		while (ans == 'y')
		{
			double tot = Double.parseDouble(JOptionPane.showInputDialog("Cuanto recibio"));
			int d = Integer.parseInt(JOptionPane.showInputDialog("Que dia de la semana? Lunes - 1, Domingo - 7"));
			dia[d - 1] = dia[d - 1] + tot;
			ans = JOptionPane.showInputDialog("Hay mas ventas? y/n ").charAt(0);			
		}
		System.out.println("Lunes: $" + dia[0]);
		System.out.println("Martes: $" + dia[1]);
		System.out.println("Miercoles: $" + dia[2]);
		System.out.println("Jueves: $" + dia[3]);
		System.out.println("Viernes: $" + dia[4]);
		System.out.println("Sabado: $" + dia[5]);
		System.out.println("Domingo: $" + dia[6]);				
	}
}
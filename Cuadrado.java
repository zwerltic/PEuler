// Jose Javier Tlacuilo Fuentes
// A01420128
// 26/01/2016

import javax.swing.JOptionPane;

public class Cuadrado {

	public static void main(String[] args) {
		double lado = Double.parseDouble(JOptionPane.showInputDialog("Dame el lado"));
		System.out.println("El area es " + (lado * lado) + " y el perimetro es " + (lado * 4));

	}

}
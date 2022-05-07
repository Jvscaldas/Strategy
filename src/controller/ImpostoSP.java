package controller;

import javax.swing.JOptionPane;

public class ImpostoSP implements IImpostoStrategy {

	@Override
	public void calcImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog(null, "Área: "));
		int nmrComodos = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de cômodos: "));
		float imposto = (area * 10) + (nmrComodos * 2);
		
		System.out.println("Imposto a pagar em SP: " + imposto);
	}

}

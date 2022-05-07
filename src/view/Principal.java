package view;

import controller.IImpostoStrategy;
import controller.ImpostoCWB;
import controller.ImpostoPA;

public class Principal {

	public static void main(String[] args) {
		IImpostoStrategy calc;

		//calc = new ImpostoSP();
		//calc = new ImpostoBH();
		//calc = new ImpostoPA();
		 calc = new ImpostoCWB();
		
		calc.calcImposto();
	}

}

package senaibr.br.aplc.aplicativo;

import senaibr.br.calc.calculos.Matematica;

public class Calculadora 
{

	public static void main(String[] args) 
	{
		
		Matematica calculo = new Matematica();
//		Matematica calculo1 = new Matematica();
		
		calculo.a = 5;
		calculo.b = 10;
//		calculo1.a = 10;
//		calculo.b = 15;
		
		calculo.somar(); 
//		calculo1.subtrair();
		
	}

}

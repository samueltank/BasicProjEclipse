package senaibr.br.calc.calculos;

public class Matematica {

	public int a, b, resultado;
	
	 public void somar() // m�todo = fun��o (em OOP chamamos fun��es de m�todos)
	{
		resultado = a + b;
		System.out.printf("O resultado �: %d\n", resultado);
		subtrair();
	}
		
	public void subtrair()
	{
		resultado = a - b;
		System.out.printf("O resultado �: %d\n", resultado);
	}
	
	public void multiplicar()
	{
		resultado = a * b;
		System.out.printf("O resultado �: %d\n", resultado);
	}
	
	public void dividir()
	{
		resultado = (a / b);
		System.out.printf("O resultado �: %d\n", resultado);
	}
}

package senaibr.br.calc.calculos;

public class Matematica {

	public int a, b, resultado;
	
	 public void somar() // método = função (em OOP chamamos funções de métodos)
	{
		resultado = a + b;
		System.out.printf("O resultado é: %d\n", resultado);
		subtrair();
	}
		
	public void subtrair()
	{
		resultado = a - b;
		System.out.printf("O resultado é: %d\n", resultado);
	}
	
	public void multiplicar()
	{
		resultado = a * b;
		System.out.printf("O resultado é: %d\n", resultado);
	}
	
	public void dividir()
	{
		resultado = (a / b);
		System.out.printf("O resultado é: %d\n", resultado);
	}
}

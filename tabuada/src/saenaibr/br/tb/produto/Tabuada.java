package saenaibr.br.tb.produto;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int contador, multiplicando, multiplicador,res;

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o multiplicando?: ");
		multiplicando = ler.nextInt();
		
		System.out.print("At� qual multiplicador?: ");
		multiplicador = ler.nextInt();
		
		ler.close();
		
		contador = 0;
		
		System.out.println("");
		System.out.println("       TABUADA DO " + multiplicando);
		System.out.println("----------------------------");
		
		for (contador = 1; contador <= multiplicador; contador++)
		{
			res = multiplicando  * contador;
			System.out.println(multiplicando + " x " + contador + " = " + res);
		}
		/*while(contador <= multiplicador) {
			res = multiplicando  * contador;
			System.out.println(multiplicando + " x " + contador + " = " + res);
			contador++;
		}*/
		System.out.println("----------------------------");
	}
 }

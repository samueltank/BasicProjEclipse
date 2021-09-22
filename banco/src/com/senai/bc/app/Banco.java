package com.senai.bc.app;

import com.senai.bc.conta.Conta;

public class Banco 
{

	public static void main(String[] args) 
	{
		Conta contaDaMaria = new Conta();
		contaDaMaria.titular = "Maria Antonieta";
		contaDaMaria.agencia = "5521-7";
		contaDaMaria.numero = "7845-5";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 1000;
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.titular = "Pedro Calcinha";
		contaDoPedro.agencia = "5521-7";
		contaDoPedro.numero = "1245-8";
		contaDoPedro.tipoConta = "Poupança";
		contaDoPedro.saldo = 500;
		
		System.out.println(contaDaMaria.saldo); // Ver saldo da Maria;
		System.out.println(contaDoPedro.saldo); // Ver saldo do Pedro;
		
		contaDaMaria.saldo += 100; // Adicionando 100 ao saldo da Maria;
		System.out.println();
		
		contaDoPedro.depositar(100);
		System.out.print(contaDoPedro.saldo);
	}
}

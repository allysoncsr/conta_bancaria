package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;

		System.out.print("Digite numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja iniciar com algum depósito? (S/N)  ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Digite valor do deposito Inicial: ");
			double depositoInicial = sc.nextDouble();
			account = new Conta(numero, nome, depositoInicial);
		}
		else {
			account = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("DADOS DA CONTA:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite valor de deposito: R$");
		double valorDeposito = sc.nextDouble();
		account.deposito(valorDeposito);
		System.out.println("DADOS DA CONTA ATUALIZADO:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite valor do saque: R$");
		double valorSaque = sc.nextDouble();
		account.saque(valorSaque);
		System.out.println("DADOS DA CONTA ATUALIZADO:");
		System.out.println(account);
		
		sc.close();
	}
}
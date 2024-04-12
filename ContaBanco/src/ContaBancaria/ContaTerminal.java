package ContaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 0;
		int numero = 0;
		String agencia, nome;
		
		System.out.println("Digite o seu Nome:");
		nome = sc.nextLine();
		System.out.println("Digite o número da sua Conta:");
		numero = sc.nextInt();
		System.out.println("Digite o número da sua Agência:");
		agencia = sc.next();
		System.out.println("Digite seu saldo:");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo de RS" + saldo + " já está disponível para saque.");
		
	}

}

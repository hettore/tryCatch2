package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		try {

			cadastro();

		} catch (InputMismatchException e) {
			System.out.println("Entrada incorreta! Use números para inserir sua altura(usando .) e idade.");
			System.out.println();
			System.out.println("Reiniciando aplicação.");
			System.out.println();
			cadastro();
		}

	}

	public static void cadastro() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = sc.next();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.next();

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();

		// imprimindo os dados obtidos pelo usuario
		System.out.println();
		System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		System.out.println("Tenho " + idade + " anos, ");
		System.out.println("Minha altura é " + altura + "cm. ");
		sc.close();
	}
}

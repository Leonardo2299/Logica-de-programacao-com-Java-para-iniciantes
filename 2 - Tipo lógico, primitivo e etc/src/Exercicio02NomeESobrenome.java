import java.util.Scanner;

public class Exercicio02NomeESobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println(nome + " " + sobrenome);
		
		scanner.close();

	}

}

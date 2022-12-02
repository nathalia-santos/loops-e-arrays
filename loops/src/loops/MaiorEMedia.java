package loops;

import java.util.Scanner;

public class MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int cont = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			cont = cont + 1;
			if (numero > maior) {
				maior = numero;
			}
		}while(cont < 5);
		System.out.println(maior);
	}
}

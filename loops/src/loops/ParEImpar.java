package loops;

import java.util.Scanner;

public class ParEImpar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int cont = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares ++;
			
			cont ++;
		
	} while(cont < quantNumeros);
	System.out.println(quantPares);
	System.out.println(quantImpares);

	}
}

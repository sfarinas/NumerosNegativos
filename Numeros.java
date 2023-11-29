package arranjoExercicios;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Quantos numero vc ira digitar ? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero entre 10 e -10 : ");
			int numero = sc.nextInt();
			
			if (numero >= -10 && numero <= 10) {
				vect[i] = numero;
			} else {
				System.out.println();
				System.out.println(" == INVALID NUMBER == ");
				System.out.println();
				i--;
			}
		}
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		System.out.println();
		System.out.println("FIM");
		
		
		sc.close();
	}

}

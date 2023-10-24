package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public abstract class ExercicioDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		Double Area = 3.14159 * (raio * raio);
		
		System.out.printf("A área do circulo é : %.4f%n", Area);
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}

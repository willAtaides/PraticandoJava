package EstruturaSequencial;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Insira o primeiro valor inteiro:");
		num1 = sc.nextInt();
		System.out.println("Insira o segundo valor inteiro:");
		num2 = sc.nextInt();
		
		System.out.println("SOMA = "+ (num1+num2));
		
		sc.close();
	}

}

package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		System.out.println("Entre com quatro valores para A, B, C e D: ");

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("A diferença é: " + ((A*B)-(C*D)));

		sc.close();
	}

}

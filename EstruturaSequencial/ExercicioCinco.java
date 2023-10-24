package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1;
		int codPeca2;
		int numPeca1;
		int numPeca2;
		double valorUni1;
		double valorUni2;
		
		System.out.println("Código da Peça 1 Peça 2 : ");
		codPeca1 = sc.nextInt();
		codPeca2 = sc.nextInt();
		
		System.out.println("Diga a quantidades da Peça 1 que você deseja e a quantidade de Peça 2 : ");
		numPeca1 = sc.nextInt();
		numPeca2 = sc.nextInt();
		
		System.out.println("Diga o valor da Peça1 e da Peça 2: ");
		valorUni1 = sc.nextDouble();
		valorUni2 = sc.nextDouble();
		
		System.out.printf("O valor a ser pago do seu pedido é:  R$ %.2f ",((numPeca1*valorUni1)+(numPeca2*valorUni2)));
		
		sc.close();
	}

}

package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idFuncionario;
		double nHorasTrabalhadas;
		double valorHoraTrabalhada;
		double salario;
		
		
		System.out.println("Entre com seu id: ");
		idFuncionario = sc.nextInt();
		System.out.println("Entre com o número de horas que trabalhou: ");
		nHorasTrabalhadas = sc.nextDouble();
		System.out.println("Entre com o valor de sua hora trabalhada: ");
		valorHoraTrabalhada = sc.nextDouble();
		
		salario = nHorasTrabalhadas * valorHoraTrabalhada;
		
		
		System.out.printf("O salário do id %d é %.2f", idFuncionario, salario);
		
		
		
		
		sc.close();
	}

}

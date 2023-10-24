package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		System.out.println("Entre com os valores de A, B e C:  ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTR = ((A*C)/2);
		double areaCL = 3.14159*C*C;
		double areaTP = ((A+B)*C)/2;
		double areaQD = B*B;
		double areaRT = A*B;
		
		System.out.printf("TRIANGULO %.3f %n",areaTR);
		System.out.printf("CIRCULO %.3f %n",areaCL);
		System.out.printf("TRAPEZIO %.3f %n",areaTP);
		System.out.printf("QUADRADO %.3f %n",areaQD);
		System.out.printf("RETANGULO %.3f %n",areaRT);
		
		
		sc.close();
	}

}

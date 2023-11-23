import java.util.Scanner;

public class Desafia_tu_logica_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo.
//		A continuación, muestra los primeros 20 números sucesivos a dicho número.
		
		/////////////////////////////////////////////////////////////////////////////////
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número positivo");
		int num = entrada.nextInt();
		
		while(num<0) {
			System.out.println("El número no puede ser negativo, Introduce otro número válido.");
			num = entrada.nextInt();
		}
		
		System.out.println("El número introducido es "+ num + ". Los 20 números consecutivos a "+ num + " son:");
		
		for (int i = num+1; i<= num +20; i++) {
			System.out.println(i);
			
		}
		
	}
}

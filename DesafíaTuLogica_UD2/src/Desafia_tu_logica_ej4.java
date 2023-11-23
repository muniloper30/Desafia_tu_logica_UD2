import java.util.*;
public class Desafia_tu_logica_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento,
//		que puede ser ascendente o descendente, a continuación, según el orden indicado
//		se mostrarán en pantalla dichos números.
//		Ej.: si los números introducidos son 4,7,2 y se escoge orden ascendente (de menor a mayor)
//		aparecen en pantalla en este orden 2,4,7, si el ordenamiento es descendente (de mayor a menor)
//		se mostrarán en el siguiente 7, 4, 2. Utiliza estructuras de control adecuadas.  
		
//		///////////////////////////////////////////////////////////////////////////////////////
		
		Scanner firstSc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int num1= firstSc.nextInt();
		
		Scanner secondSc = new Scanner(System.in);
		System.out.println("Introduce el segundo número");
		int num2= secondSc.nextInt();
		
		Scanner thirdSc = new Scanner(System.in);
		System.out.println("Introduce el tercer número");
		int num3= thirdSc.nextInt();
		
		String ascendente = "Ascendente";
		String descendente = "Descendente";
		
		System.out.println("Introduce ordenamiento 1:Ascendente/2:Descendente");
		
		Scanner select= new Scanner(System.in);

		
		int seleccion = select.nextInt();
		
			
			
		switch(seleccion) {
		case 1:
			System.out.println("Ordenamiento Ascendente seleccionado");
			if(num1<num2 && num2< num3) {
				System.out.println("El orden es " + num1+ " , " + num2 + " , " + num3 + "." );
			}else if(num1<num3 && num2>num3) {
				System.out.println("El orden es "+ num1+ " , " + num3+ " , " + num2 + ".");
			}else if(num1>num3 && num2<num3) {
				System.out.println("El orden es "+ num2+ " , " + num3+ " , " + num1 + ".");
			}else if (num1>num2 && num2>num3) {
				System.out.println("El orden es "+ num3+ " , " + num2+ " , " + num1 + ".");
			}else if (num2>num1 && num1>num3) {
				System.out.println("El orden es "+ num3+ " , " + num1+ " , " + num2 + ".");
			}else if (num2<num1 && num1<num3) {
				System.out.println("El orden es "+ num2+ " , " + num1+ " , " + num3 + ".");
			}
			break;
			
		case 2 :
			System.out.println("Ordenamiento Descendente seleccionado");
			if(num1<num2 && num2< num3) {
				System.out.println("El orden es " + num3+ " , " + num2 + " , " + num1 + "." );
			}else if(num1<num3 && num2>num3) {
				System.out.println("El orden es "+ num2+ " , " + num3+ " , " + num1 + ".");
			}else if(num1>num3 && num2<num3) {
				System.out.println("El orden es "+ num1+ " , " + num3+ " , " + num2 + ".");
			}else if (num1>num2 && num2>num3) {
				System.out.println("El orden es "+ num1+ " , " + num2+ " , " + num3 + ".");
			}else if (num2>num1 && num1>num3) {
				System.out.println("El orden es "+ num2+ " , " + num1+ " , " + num3 + ".");
			}else if (num2<num1 && num1<num3) {
				System.out.println("El orden es "+ num3+ " , " + num1+ " , " + num2 + ".");
			}
			break;
			default:
				System.out.println("No se ha seleccionado orden para los números. ");
		}
		
			
				
			
    
		
			
		
		
	}
	
		
		
	}



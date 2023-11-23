

public class Desafia_tu_logica_ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 
//		que hay entre 1 y 100. Utiliza las estructuras de control que creas convenientes.
		
		///////////////////////////////////////////////////////////////////////////////
		
		int contador= 0;
		
		for(int i = 1; i<=100;i++) {
			if(i%2 == 0 || i%3 == 0 ){
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Hay "+ contador + " números que son multiplos de 2 o de 3 entre 1 y 100.");
}
}
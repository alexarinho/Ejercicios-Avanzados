import java.util.Scanner;

public class Menu {
	public static int Menu() {
		Scanner leer = new Scanner(System.in);
		int opc=0;
		
		System.out.println("Men�");
		System.out.println("Opcion 1: N�mero Perfecto");
		System.out.println("Opcion 2: A�o Bisiesto");
		System.out.println("Opcion 3: Decodificar Fecha");
		System.out.println("Opcion 4: Numero Primo");
		System.out.println("Opcion 5: Conversion a Binario");
		System.out.println("Opcion 6: Cifra de mayor valor");
		System.out.println("Opcion 7: Salir");
		
		opc = leer.nextInt();
		return opc;
	}
}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		do {
			opc = Menu.Menu();
			switch (opc) {
			case 1:
				Ejercicios.Ejercicio1();
				break;
			case 2:
				Ejercicios.Ejercicio2();
				break;
			case 3:
				Ejercicios.Ejercicio3();
				break;
			case 4:
				Ejercicios.Ejercicio4();
				break;
			case 5:
				Ejercicios.Ejercicio5();
				break;
			case 6:
				Ejercicios.Ejercicio6();
				break;
			}
		}while(opc!=7);
	}

}

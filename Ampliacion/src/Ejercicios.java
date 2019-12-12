/**
 * @author Alex Noe
 * Ejercicios para la clase principal
 */
import java.util.Scanner;

public class Ejercicios {
	
	public static void Ejercicio1() {
		Scanner leer=new Scanner(System.in);
		int num=0;
		int aux=0;
		System.out.println("Ejercicio 1:");
		try {
			num = leer.nextInt();
			
			for (int i = 0; i < num; i++) {
				if(num %i==0){
					aux+=i;
				}
			}
			if(num==aux) {
				System.out.println("Este numero es perfecto");
			} else {
				System.out.println("Este numero no es perfecto");
			}
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Error aritmetico");
		} catch(Exception e) {
			System.out.println("Error desconocido");
		} finally {
			System.out.println("Espabila");
		}
		
	}
	
	public static void Ejercicio2() {
		Scanner leer= new Scanner(System.in);
		int año =0;
		System.out.println("Ejercicio 2:");
		año = leer.nextInt();
		
		if(año %4==0 && año%100==0 && año%400==0) {
			System.out.println("Este año es bisiesto");
		} else {
			System.out.println("Este año no es bisiesto");
		}
	}
	
	public static void Ejercicio3() {
		Scanner leer = new Scanner(System.in);
		int fecha =0;
		System.out.println("Ejercicio3");
		fecha = leer.nextInt();
		for (int i = 0; i < fecha; i++) {
			
		}
	}
	
	public static void Ejercicio4() {
		Scanner leer=new Scanner(System.in);
		int num=0;
		System.out.println("Ejercicio 4:");
		num=leer.nextInt();
		if(num %2!=0) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo"); 
		}
	}
	
	public static void Ejercicio5() {
		
	}
	
	public static void Ejercicio6() {
		Scanner leer = new Scanner(System.in);
		String num ="";
		int mayor=0;
		
		System.out.println("Ejercicio 6:");
		num = leer.nextLine();
		
		for (int i = 0; i < num.length(); i++) {
			if(i>i) {
				mayor+=i;
			}
		}
		System.out.println(mayor);
	}
}


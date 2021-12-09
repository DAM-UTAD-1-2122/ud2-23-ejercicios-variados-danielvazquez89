import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Realizar un programa que pida cargar una fecha cualquiera, luego
 *         verificar si dicha fecha corresponde a Navidad.
 * 
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		// Inicializamos el Scanner para leer el d�a y el mes
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el d�a: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		// Inicializamos el String resultado el cual imprimiremos luego con el valor que
		// salga del if diciendo si es o no es navidad
		String resultado;
		if (dia >= 24 && mes == 12 || dia <= 6 && mes == 1) {
			resultado = "Es navidad!";
		} else {
			resultado = "No es navidad :( ...";
		}
		System.out.println(resultado);
		sc.close();
	}
}

import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Realizar un programa que pida cargar una fecha cualquiera, luego
 *         verificar si dicha fecha corresponde a Navidad.
 * 
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		// Inicializamos el Scanner para leer el día y el mes
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día: ");
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

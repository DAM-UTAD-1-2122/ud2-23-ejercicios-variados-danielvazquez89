import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresan tres notas de un alumno, si el promedio es mayor o igual
 *         a siete mostrar un mensaje "Promocionado".
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Introduce la segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Introduce la tercera nota: ");
		int nota3 = sc.nextInt();
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			System.out.println("Promocionado");
		}
		sc.close();
		// Me he ajustado a lo que dice el ejercicio que solo te pide el mensaje
		// "Promocionado" y nada más
	}
}

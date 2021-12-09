import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se ingresan tres notas de un alumno, si el promedio es mayor o igual
 *         a siete mostrar un mensaje "Promocionado".
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		// Inicializamos el Scanner para leer las notas introducidas
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Introduce la segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Introduce la tercera nota: ");
		int nota3 = sc.nextInt();
		// Las sumamos y dividimos entre el n�mero de notas para sacar la media, y
		// usamos el if para ver si esta media es mayor o igual que 7, si es as� se
		// imprime el mensaje "Promocionado"
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			System.out.println("Promocionado");
		}
		sc.close();
		// Me he ajustado a lo que dice el ejercicio que solo te pide el mensaje
		// "Promocionado" y si no es mayor o igual a 7 no te dice que haya que imprimir
		// nada
	}
}

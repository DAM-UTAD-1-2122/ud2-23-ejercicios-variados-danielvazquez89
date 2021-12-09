import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Realizar un programa que lea por teclado dos n�meros, si el primero
 *         es mayor al segundo informar su suma y diferencia, en caso contrario
 *         informar el producto y la divisi�n del primero respecto al segundo.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		//Importamos el Scanner y preguntamos por los valores
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int n2 = sc.nextInt();
		//Si el primer valor es mayor por el segundo, se saca la suma y la diferencia 
		if (n1 > n2) {
			System.out.println("Su suma es igual a: " + (n1 + n2));
			System.out.println("Su diferencia es igual a: " + (n1 - n2));
		//Sino se saca el producto y la divisi�n
		} else {
			System.out.println("Su producto ser� igual a: " + (n2 * n1));
			System.out.println("La divisi�n del primero respecto al segundo es: " + (n1 / n2));
		}
		sc.close();
	}
}

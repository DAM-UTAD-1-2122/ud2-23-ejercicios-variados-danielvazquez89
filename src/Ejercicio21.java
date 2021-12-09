import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Desarrollar un programa que permita cargar n n�meros enteros y luego
 *         nos informe cu�ntos valores fueron pares y cu�ntos impares. Emplear
 *         el operador ?%? en la condici�n de la estructura condicional: if
 *         (valor%2==0) //Si el if da verdadero luego es par.
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countPares = 0, countImpares = 0;
		System.out.println("Introduzca la cantidad de valores a introducir: ");
		int n = sc.nextInt();
		System.out.println("Introduzca los valores: ");
		while (n > 0) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				countPares++;
			} else {
				countImpares++;
			}
			n--;
		}
		System.out.println("Se han introducido " + countPares + " valores pares");
		System.out.println("Se han introducido " + countImpares + " valores impares");
		sc.close();
	}
}

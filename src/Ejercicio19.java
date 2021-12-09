/**
 * 
 * @author Daniel V�zquez
 *
 *         Mostrar los m�ltiplos de 8 hasta el valor 500. Debe aparecer en
 *         pantalla 8 - 16 - 24, etc
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		// En este programa se suma a la variable num el valor de 8 por cada iteraci�n y
		// se imprime el valor, se sale del bucle while cuando el valor alcanzado por
		// num es mayor a 500, as� conseguimos todos los m�ltiplos de 8 hasta 500 como
		// se nos pide
		int num = 0;
		while (num <= 500) {
			num += 8;
			if (num != 8) { // Este if lo uso para que no aparezca un gui�n de m�s
				System.out.print(" - " + num);
			} else {
				System.out.print(num);
			}
		}
	}

}

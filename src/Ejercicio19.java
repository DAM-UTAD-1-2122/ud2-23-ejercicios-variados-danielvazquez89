/**
 * 
 * @author Daniel V�zquez
 *
 *         Mostrar los m�ltiplos de 8 hasta el valor 500. Debe aparecer en
 *         pantalla 8 - 16 - 24, etc
 */
public class Ejercicio19 {

	public static void main(String[] args) {
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

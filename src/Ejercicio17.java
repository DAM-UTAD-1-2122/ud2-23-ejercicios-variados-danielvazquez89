import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         En una empresa trabajan n empleados cuyos sueldos oscilan entre $100
 *         y $500, realizar un programa que lea los sueldos que cobra cada
 *         empleado e informe cu�ntos empleados cobran entre $100 y $300 y
 *         cu�ntos cobran m�s de $300. Adem�s el programa deber� informar el
 *         importe que gasta la empresa en sueldos al personal.
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumSueldos = 0;
		int sueldosBajos = 0;
		int sueldosAltos = 0;
		System.out.println("Introduce el n�mero de empleados: ");
		int empleados = sc.nextInt();
		System.out.println("Introduce los sueldos ( entre 100 y 500 ): ");
		while (empleados > 0) {
			int sueldos = sc.nextInt();
			if (sueldos <= 300 && sueldos >= 100) {
				sueldosBajos += 1;
			} else if (sueldos > 300) {
				sueldosAltos += 1;
			} else {
				System.out.println("Se ha introducido una cantidad de sueldo err�nea!");
			}
			sumSueldos += sueldos;
			empleados--;
		}
		System.out.println("Hay " + sueldosBajos + " sueldos que ostilan entre 100 y 300 Y " + "hay " + sueldosAltos
				+ " sueldos mayores a 300 euros");
		System.out.println("La empresa ha gastado " + sumSueldos + " euros en sueldos");
		sc.close();
	}

}

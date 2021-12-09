import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         En una empresa trabajan n empleados cuyos sueldos oscilan entre $100
 *         y $500, realizar un programa que lea los sueldos que cobra cada
 *         empleado e informe cuántos empleados cobran entre $100 y $300 y
 *         cuántos cobran más de $300. Además el programa deberá informar el
 *         importe que gasta la empresa en sueldos al personal.
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		// Importamos el Scanner y inicializamos las variables necesarias para almacenar
		// los datos pedidos (la suma de sueldos, los sueldos menores a 300, y los
		// sueldos mayores a 300)
		Scanner sc = new Scanner(System.in);
		int sumSueldos = 0;
		int sueldosBajos = 0;
		int sueldosAltos = 0;
		// Leemos la cantidad de empleados de los que introduciremos su sueldo
		System.out.println("Introduce el número de empleados: ");
		int empleados = sc.nextInt();
		// Pedimos que se introduzcan los sueldos y con un while pedimos la cantidad de
		// sueldos que se ha especificado antes
		System.out.println("Introduce los sueldos ( entre 100 y 500 ): ");
		while (empleados > 0) {
			int sueldos = sc.nextInt();
			// Con los if vemos en que rango se encuentra el valor y dependiendo de ello
			// sumamos 1 al contador respectivo
			if (sueldos <= 300 && sueldos >= 100) {
				sueldosBajos += 1;
			} else if (sueldos > 300) {
				sueldosAltos += 1;
			} else {
				System.out.println("Se ha introducido una cantidad de sueldo errónea!");
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

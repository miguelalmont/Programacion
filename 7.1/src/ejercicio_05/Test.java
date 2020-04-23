/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excepciones.ControlExcepciones;

public class Test {
	static ControlExcepciones ex = new ControlExcepciones();
	static Scanner entrada = new Scanner(System.in);
	static List<Empleado> listaEmpleados = new ArrayList<>();

	public static void menu() {
		int key;
		do {
			System.out.println("Menú Empleados");
			System.out.println(
					"1. Insertar Comercial\n2. Insertar Directivo\n3. Calcular sueldo\n4. Eliminar entrada.\n5. Ver retenciones.\n6. Ver gratificiones.\n0. Salir del programa.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el dni:");
				String dni = entrada.nextLine();
				if (listaEmpleados.stream().noneMatch(e -> e.getDni().equalsIgnoreCase(dni))) {
					System.out.println("Introduce el nombre completo:");
					String nombre = entrada.nextLine();
					System.out.println("Introduce el sueldo bruto:");
					double sueldoBruto = ex.controlDouble();
					System.out.println("Introduce la cantidad en ventas:");
					double ventas = ex.controlDouble();
	
					listaEmpleados.add(new Comercial(dni, nombre, sueldoBruto, ventas));
				} else {
					System.out.println("Ya existe ese dni en la lista.");
				}

				break;
			case 2:
				System.out.println("Introduce el dni:");
				dni = entrada.nextLine();
				if (listaEmpleados.stream().noneMatch(e -> e.getDni().equalsIgnoreCase(dni))) {
					System.out.println("Introduce el nombre completo:");
					String nombre = entrada.nextLine();
					System.out.println("Introduce el sueldo bruto:");
					double sueldoBruto = ex.controlDouble();
					System.out.println("Introduce la comision:");
					double comision = ex.controlDouble();
	
					listaEmpleados.add(new Directivo(dni, nombre, sueldoBruto, comision));
				} else {
					System.out.println("Ya existe ese dni en la lista.");
				}
				
				break;
			case 3:
				System.out.println("Introduce el dni del empleado al que calcular el sueldo:");
				dni = entrada.nextLine();
				if (listaEmpleados.stream().anyMatch(e -> e.getDni().equalsIgnoreCase(dni))) {
					System.out.println("Introduce el numero de hijos del trabajador:");
					int nHijos = ex.controlInt();
						
						listaEmpleados.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny()
								.ifPresent(e -> e.calcularSueldo());
						listaEmpleados.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny()
						.ifPresent(e -> e.gratificacion(nHijos));
						System.out.println("El sueldo ha sido actualizado a " + listaEmpleados.stream()
								.filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny().get().calcular() + "€");
				} else {
					System.out.println("El dni introducido no esta en la lista.");
				}

				break;
			case 4:
				System.out.println("Introduce el dni del empleado que quieres eliminar:");
				dni = entrada.nextLine();

				if (listaEmpleados.stream().anyMatch(e -> e.getDni().equalsIgnoreCase(dni))) {
					listaEmpleados.remove(
							listaEmpleados.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny().get());
					System.out.println("El empleado ha sido borrado");
				} else {
					System.out.println("El dni introducido no esta en la lista.");
				}

				break;
			case 5:
				System.out.println("Introduce el dni del empleado que quieres consultar:");
				dni = entrada.nextLine();

				listaEmpleados.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny()
						.ifPresentOrElse(e -> System.out.println(e.retencion()), new Runnable() {
							public void run() {
								System.out.println("El dni introducido no esta en la lista.");
							}
						});

				break;
			case 6:
				System.out.println("Introduce el dni del empleado que quieres consultar:");
				dni = entrada.nextLine();
				if (listaEmpleados.stream().anyMatch(e -> e.getDni().equalsIgnoreCase(dni))) {
					System.out.println("Introduce el numero de hijos del trabajador:");
					int nHijos = ex.controlInt();
					listaEmpleados.stream().filter(e -> e.getDni().equalsIgnoreCase(dni)).findAny()
							.ifPresent(e -> System.out.println(e.gratificacion(nHijos)));
				} else {
					System.out.println("El dni introducido no existe.");
				}
				break;
			case 0:
				System.out.println("Ha salido del programa.");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}

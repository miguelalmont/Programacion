/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excepciones.ControlExcepciones;

public class Test {
	
	static ControlExcepciones ex = new ControlExcepciones();
	static Scanner entrada = new Scanner(System.in);
	
	static List<Empleado> listaEmpleados = new ArrayList<>();
	static long staticnSS;

	public static void mostrarSalario() {
		System.out.println("Introduce el numero de Seguridad Social del empleado para ver su salario:");
		long nSS = ex.controlLong();
		listaEmpleados.stream().filter(e -> e.getnSS() == nSS).findAny().ifPresentOrElse(e -> System.out.println(e.ingresos()), new Runnable() {
			public void run() {
				System.out.println("El empleado no esta en la lista.");
			}
		});
	}
	
	public static void eliminarEmpleado() {
		System.out.println("Introduce el numero de Seguridad Social del empleado para eliminarlo:");
		long nSS = ex.controlLong();
		Empleado temp = listaEmpleados.stream().filter(e -> e.getnSS() == nSS).findAny().orElse(null);
		if (temp != null)
			listaEmpleados.remove(temp);
		else
			System.out.println("El empleado no esta en la lista.");
	}
	
	public static void menuModEmpleadoAsalariado() {
		int key;
		do {
			System.out.println("Menú Empleado Asalariado");
			System.out.println(
					"1. Modificar nombre.\n2. Modificar apellido.\n3. Modificar numero de Seguridad Social.\n4. Modificar salario semanal.\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setNombre(entrada.nextLine()));
				
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setApellido(entrada.nextLine()));
				
				break;
			case 3:
				System.out.println("Introduce el nuevo numero de la Seguridad Social:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setnSS(ex.controlLong()));
				
				break;
			case 4:
				System.out.println("Introduce el nuevo salario semanal:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoAsalariado)e).establecerSueldo(ex.controlDouble()));

				break;
			case 0:
				System.out.println("Volviendo al menu anterior...");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}
	
	public static void menuModEmpleadoPorHoras() {
		int key;
		do {
			System.out.println("Menú Empleado por Horas");
			System.out.println(
					"1. Modificar nombre.\n2. Modificar apellido.\n3. Modificar numero de Seguridad Social.\n4. Modificar sueldo por horas.\n5. Modificar numero de horas trabajadas.\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setNombre(entrada.nextLine()));
				
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setApellido(entrada.nextLine()));
				
				break;
			case 3:
				System.out.println("Introduce el nuevo numero de la Seguridad Social:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setnSS(ex.controlLong()));
				
				break;
			case 4:
				System.out.println("Introduce el nuevo sueldo por horas:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoPorHoras)e).establecerSueldo(ex.controlDouble()));
				
				break;
			case 5:
				System.out.println("Introduce el nuevo numero de horas:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoPorHoras)e).establecerHoras(ex.controlInt()));
				
				break;
			case 0:
				System.out.println("Volviendo al menu anterior...");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}
	
	public static void menuModEmpleadoPorComision() {
		int key;
		do {
			System.out.println("Menú Empleado por Comision");
			System.out.println(
					"1. Modificar nombre.\n2. Modificar apellido.\n3. Modificar numero de Seguridad Social.\n4. Modificar cantidad total de ventas.\n5. Modificar tarifa de comision.\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setNombre(entrada.nextLine()));
				
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setApellido(entrada.nextLine()));
				
				break;
			case 3:
				System.out.println("Introduce el nuevo numero de la Seguridad Social:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setnSS(ex.controlLong()));
				
				break;
			case 4:
				System.out.println("Introduce la nueva cantidad en ventas:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoPorComision)e).establecerVentas(ex.controlDouble()));
				
				break;
			case 5:
				System.out.println("Introduce la nueva tarifa por comision:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoPorComision)e).establecerComision(ex.controlDouble()));

			case 0:
				System.out.println("Volviendo al menu anterior...");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}
	
	public static void menuModEmpleadoBaseMasComision() {
		int key;
		do {
			System.out.println("Menú Empleado Asalariado mas Comision");
			System.out.println(
					"1. Modificar nombre.\n2. Modificar apellido.\n3. Modificar numero de Seguridad Social.\\n4. Modificar cantidad total de ventas.\n5. Modificar tarifa de comision.\n6. Modificar sueldo base.\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setNombre(entrada.nextLine()));
				
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setApellido(entrada.nextLine()));
				
				break;
			case 3:
				System.out.println("Introduce el nuevo numero de la Seguridad Social:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> e.setnSS(ex.controlLong()));
				
				break;
			case 4:
				System.out.println("Introduce la nueva cantidad en ventas:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoBaseMasComision)e).establecerVentas(ex.controlDouble()));
				
				break;
			case 5:
				System.out.println("Introduce la nueva tarifa por comision:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoBaseMasComision)e).establecerComision(ex.controlDouble()));
				
				break;
			case 6:
				System.out.println("Introduce el nuevo sueldo base:");
				listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).forEach(e -> ((EmpleadoBaseMasComision)e).establecerSalarioBase(ex.controlDouble()));

			case 0:
				System.out.println("Volviendo al menu anterior...");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}
	
	public static void modificarEmpleado() {
		System.out.println("Introduce el numero de la Seguridad Social del empleado");
		staticnSS = ex.controlLong();
		Empleado temp = listaEmpleados.stream().filter(e -> e.getnSS() == staticnSS).findAny().orElse(null);
		if (temp instanceof EmpleadoAsalariado)
			menuModEmpleadoAsalariado();
		else if (temp instanceof EmpleadoPorHoras)
			menuModEmpleadoPorHoras();
		else if (temp instanceof EmpleadoPorComision)
			menuModEmpleadoPorComision();
		else if (temp instanceof EmpleadoBaseMasComision)
			menuModEmpleadoBaseMasComision();
		else
			System.out.println("El numero introducido no está en la lista.");
			
	}
	
	public static void listarEmpleados() {
		listaEmpleados.stream().forEach(e -> System.out.println(e.toString()));
	}
	
	public static void menuAniadirEmpleado() {
		int key;
		do {
			System.out.println("Menú Añadir Empleado");
			System.out.println("Selecciona un tipo de empleado:");
			System.out.println(
					"1. Añadir empleado asalariado.\n2. Añadir empleado por horas.\n3. Añadir empleado por comision.\n4. Añadir empleado con salario base mas comision.\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nombre del empleado:");
				String nombre = entrada.nextLine();
				System.out.println("Introduce el apellido paterno:");
				String apellido = entrada.nextLine();
				System.out.println("Introduce el numero de la Seguridad Social:");
				long nSS = ex.controlLong();
				System.out.println("Introduce el salario semanal:");
				double salarioSemanal = ex.controlDouble();
				
				listaEmpleados.add(new EmpleadoAsalariado(nombre, apellido, nSS, salarioSemanal));
				
				break;
			case 2:
				System.out.println("Introduce el nombre del empleado:");
				nombre = entrada.nextLine();
				System.out.println("Introduce el apellido paterno:");
				apellido = entrada.nextLine();
				System.out.println("Introduce el numero de la Seguridad Social:");
				nSS = ex.controlLong();
				System.out.println("Introduce el sueldo por horas:");
				double salario = ex.controlDouble();
				System.out.println("Introduce el numero de horas trabajadas en la semana:");
				int horas = ex.controlInt();
				
				listaEmpleados.add(new EmpleadoPorHoras(nombre, apellido, nSS, salario, horas));
				
				break;
			case 3:
				System.out.println("Introduce el nombre del empleado:");
				nombre = entrada.nextLine();
				System.out.println("Introduce el apellido paterno:");
				apellido = entrada.nextLine();
				System.out.println("Introduce el numero de la Seguridad Social:");
				nSS = ex.controlLong();
				System.out.println("Introduce las ventas:");
				double ventasBrutas = ex.controlDouble();
				System.out.println("Introduce la tarifa por comision:");
				double comision = ex.controlDouble();
				
				listaEmpleados.add(new EmpleadoPorComision(nombre, apellido, nSS, ventasBrutas, comision));
				
				break;
			case 4:
				System.out.println("Introduce el nombre del empleado:");
				nombre = entrada.nextLine();
				System.out.println("Introduce el apellido paterno:");
				apellido = entrada.nextLine();
				System.out.println("Introduce el numero de la Seguridad Social:");
				nSS = ex.controlLong();
				System.out.println("Introduce las ventas:");
				ventasBrutas = ex.controlDouble();
				System.out.println("Introduce la tarifa por comision:");
				comision = ex.controlDouble();
				System.out.println("Introduce el salario base:");
				double salarioBase = ex.controlDouble();
				
				listaEmpleados.add(new EmpleadoBaseMasComision(nombre, apellido, nSS, ventasBrutas, comision, salarioBase));
				
				break;
			case 0:
				System.out.println("Volviendo al menu anterior...");

				break;
			default:
				System.out.println("Introduce una opcion correcta.");

				break;
			}
		} while (key != 0);
	}
	
	public static void menu() {
		int key;
		do {
			System.out.println("Menú Empleados");
			System.out.println(
					"1. Añadir empleado.\n2. Listar empleados.\n3. Modificar empleado.\n4. Mostrar salario.\n5. Eliminar empleado.\n0. Salir del programa.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				menuAniadirEmpleado();
				
				break;
			case 2:
				listarEmpleados();
				
				break;
			case 3:
				modificarEmpleado();
				
				break;
			case 4:
				mostrarSalario();
				
				break;
			case 5:
				eliminarEmpleado();
				
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

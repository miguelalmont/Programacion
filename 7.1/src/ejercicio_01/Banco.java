/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */

package ejercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excepciones.ControlExcepciones;

public class Banco {
	static Scanner entrada = new Scanner(System.in);
	static ControlExcepciones ex = new ControlExcepciones();
	static List<Persona> listaPersonas = new ArrayList<>();
	static List<Cuenta> listaCuentas = new ArrayList<>();

	public static void menu() {
		int key;
		do {
			System.out.println("Menú Banco");
			System.out.println(
					"1. Introducir cliente.\n2. Crear cuenta corriente.\n3. Crear cuenta ahorro.\n4. Visualizar saldo\n5. Retirar dinero.\n6. Ingresar dinero.\n7. Actualizar saldo.\n0. Salir del programa.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el dni");
				String dni = entrada.nextLine();
				if (listaPersonas.stream().noneMatch(p -> p.getDni().equalsIgnoreCase(dni))) {
					System.out.println("Introduce el nombre:");
					String nombre = entrada.nextLine();
					System.out.println("Introduce los apellidos:");
					String apellidos = entrada.nextLine();
					
					listaPersonas.add(new Persona(nombre, apellidos, dni));
				} else {
					System.out.println("El dni ya existe.");
				}
				
				break;
			case 2:
				System.out.println("Introduce el número de la cuenta:");
				long nCuenta = ex.controlLong();
				if (listaCuentas.stream().noneMatch(c -> c.getNumeroCuenta() == nCuenta)) {
					System.out.println("Introduce el dni del cliente a asignar:");
					dni = entrada.nextLine();
					if (listaPersonas.stream().anyMatch(p -> p.getDni().equalsIgnoreCase(dni))) {
					listaCuentas.add(new CuentaCorriente(
							listaPersonas.stream().filter(p -> p.getDni().equalsIgnoreCase(dni)).findAny().get(),
							nCuenta));
					} else {
						System.out.println("El dni no existe, introduce primero el cliente con ese dni.");
					}
				} else {
					
					System.out.println("El numero de cuenta ya existe.");
				}
				break;
			case 3:
				System.out.println("Introduce el dni del cliente a asignar:");
				dni = entrada.nextLine();
				System.out.println("Introduce el número de la cuenta:");
				nCuenta = ex.controlLong();
				System.out.println("Introduce el saldo mínimo para abrir la cuenta");
				double saldoMinimo = ex.controlDouble();
				System.out.println("Introduce el interés variable anual:");
				double interes = ex.controlDouble();
				listaCuentas.add(new CuentaAhorro(
						listaPersonas.stream().filter(p -> p.getDni().equalsIgnoreCase(dni)).findFirst().get(), nCuenta,
						saldoMinimo, interes));

				break;
			case 4:
				System.out.println("Introduce el numero de cuenta para ver el saldo actual:");
				nCuenta = ex.controlLong();
						listaCuentas.stream().filter(c -> c.getNumeroCuenta() == nCuenta).findAny().ifPresentOrElse(c -> System.out.println(c.toString()), new Runnable() {
							public void run() {
								System.out.println("El numero de cuenta no existe.");
							}
						});

				break;
			case 5:
				System.out.println("Introduce el numero de cuenta para retirar dinero:");
				nCuenta = ex.controlLong();
				System.out.println("Introduce la cantidad a retirar:");
				int saldo = ex.controlInt();
				listaCuentas.stream().filter(c -> c.getNumeroCuenta() == nCuenta).findAny().ifPresentOrElse(c -> c.retirar(saldo), new Runnable() {
					public void run() {
						System.out.println("El numero de cuenta no existe.");
					}
				});

				break;
			case 6:
				System.out.println("Introduce el numero de cuenta para ingresar dinero:");
				nCuenta = ex.controlLong();
				System.out.println("Introduce la cantidad a ingresar:");
				saldo = ex.controlInt();
				listaCuentas.stream().filter(c -> c.getNumeroCuenta() == nCuenta).findAny().ifPresentOrElse(c -> c.ingresar(saldo), new Runnable() {
					public void run() {
						System.out.println("El numero de cuenta no existe.");
					}
				});

				break;
			case 7:
				System.out.println("Introduce el numero de cuenta para actualizar su saldo:");
				nCuenta = ex.controlLong();
				listaCuentas.stream().filter(c -> c.getNumeroCuenta() == nCuenta).findAny().ifPresentOrElse(c -> c.actualizarSaldo(), new Runnable() {
					public void run() {
						System.out.println("El numero de cuenta no existe.");
					}
				});;

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
		menu();
	}

}

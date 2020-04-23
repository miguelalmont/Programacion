/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excepciones.ControlExcepciones;

public class Test {
	
	static ControlExcepciones ex = new ControlExcepciones();
	static List<Persona> ps = new ArrayList<>();
	static Scanner entrada = new Scanner(System.in);
	static String Sdni;
	
	public static void añadirAlumno() {
		System.out.println("Introduce el dni");
		String dni = entrada.nextLine();
		if (ps.stream().noneMatch(p -> p.getNif().equalsIgnoreCase(dni))) {
			System.out.println("Introduce el nombre:");
			String nombre = entrada.nextLine();
			System.out.println("Introduce los apellidos:");
			String apellidos = entrada.nextLine();
			System.out.println("Introduce la calle:");
			String calle = entrada.nextLine();
			System.out.println("Introduce la ciudad:");
			String ciudad = entrada.nextLine();
			System.out.println("Introduce el codigo postal:");
			String codPostal = entrada.nextLine();
			System.out.println("Introduce el país:");
			String pais = entrada.nextLine();
			System.out.println("Introduce la id del alumno:");
			int id = ex.controlInt();
			ps.add(new Estudiante(nombre, apellidos, dni, calle, ciudad, codPostal, pais, id));
		} else {
			System.out.println("El dni ya existe.");
		}
	}
	
	public static void añadirProfesor() {
		System.out.println("Introduce el dni");
		String dni = entrada.nextLine();
		System.out.println("Introduce la calle:");
		if (ps.stream().noneMatch(p -> p.getNif().equalsIgnoreCase(dni))) {
			System.out.println("Introduce el nombre:");
			String nombre = entrada.nextLine();
			System.out.println("Introduce los apellidos:");
			String apellidos = entrada.nextLine();
			String calle = entrada.nextLine();
			System.out.println("Introduce la ciudad:");
			String ciudad = entrada.nextLine();
			System.out.println("Introduce el codigo postal:");
			String codPostal = entrada.nextLine();
			System.out.println("Introduce el país:");
			String pais = entrada.nextLine();
			System.out.println("Introduce el numero de despacho del profesor:");
			int despacho = ex.controlInt();
			ps.add(new Estudiante(nombre, apellidos, dni, calle, ciudad, codPostal, pais, despacho));
		} else {
			System.out.println("El dni ya existe.");
		}
	}
	
	public static void modificarEstudiante() {
		int key;
		System.out.println("Menu Mod Estudiante");
		do {
			System.out.println("1. Modificar nombre\n2. Modificar apellidos\n3. Modificar calle\n4. Modificar ciudad\n5. Modificar Codigo Postal\n6. Modificar pais\n7. Modificar Id\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				String nombre = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.setNombre(nombre));
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				String apellido = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.setApellidos(apellido));
				break;
			case 3:
				System.out.println("Introduce la nueva calle:");
				String calle = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCalle(calle));
				break;
			case 4:
				System.out.println("Introduce la nueva ciudad:");
				String ciudad = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCiudad(ciudad));
				break;
			case 5:
				System.out.println("Introduce el nuevo codigo postal:");
				String codPostal = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCodPostal(codPostal));

				break;
			case 6:
				System.out.println("Introduce el nuevo pais:");
				String pais = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setPais(pais));

				break;
			case 7:
				System.out.println("Introduce el nuevo id:");
				int id = ex.controlInt();
				Estudiante temp = (Estudiante) ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().orElse(null);
				temp.setIdEstudiante(id);
				
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
	
	public static void modificarProfesor() {
		int key;
		System.out.println("Menu Mod Profesor");
		do {
			System.out.println("1. Modificar nombre\n2. Modificar apellidos\n3. Modificar calle\n4. Modificar ciudad\n5. Modificar Codigo Postal\n6. Modificar pais\n7. Modificar Id\n0. Volver.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nuevo nombre:");
				String nombre = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.setNombre(nombre));
				break;
			case 2:
				System.out.println("Introduce el nuevo apellido:");
				String apellido = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.setApellidos(apellido));
				break;
			case 3:
				System.out.println("Introduce la nueva calle:");
				String calle = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCalle(calle));
				break;
			case 4:
				System.out.println("Introduce la nueva ciudad:");
				String ciudad = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCiudad(ciudad));
				break;
			case 5:
				System.out.println("Introduce el nuevo codigo postal:");
				String codPostal = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setCodPostal(codPostal));

				break;
			case 6:
				System.out.println("Introduce el nuevo pais:");
				String pais = entrada.nextLine();
				ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().ifPresent(p -> p.getDireccion().setPais(pais));

				break;
			case 7:
				System.out.println("Introduce el nuevo id:");
				int despacho = ex.controlInt();
				Profesor temp = (Profesor) ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findFirst().orElse(null);
				temp.setDespacho(despacho);
				
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
	
	public static void modificarEntrada() {
		System.out.println("Introduce el dni de la entrada que quieres modificar:");
		Sdni = entrada.nextLine();
		if (ps.stream().anyMatch(p -> p.getNif().equalsIgnoreCase(Sdni))) {
			Persona temp = ps.stream().filter(p -> p.getNif().equalsIgnoreCase(Sdni)).findAny().orElse(null);
			if (temp instanceof Estudiante) {
				modificarEstudiante();
			}
			if (temp instanceof Profesor) {
				modificarProfesor();
			}
			if (temp == null){
				 System.out.println("El dni introducido no existe.");
			}
		} else {
			System.out.println("El dni no existe.");
		}
	}
	
	public static void eliminarEntrada() {
		System.out.println("Introduce el dni de la entrada que quieres eliminar:");
		String dni = entrada.nextLine();
		if (ps.stream().anyMatch(p -> p.getNif().equalsIgnoreCase(dni))) {
			ps.removeIf(p -> p.getNif().equalsIgnoreCase(dni));
			System.out.println("La entrada ha sido eliminada.");
		} else {
			System.out.println("El dni introducido no existe.");
		}
	}
	
	public static void menu() {
		int key;
		do {
			System.out.println("Menú Universidad");
			System.out.println(
					"1. Añadir alumno\n2. Añadir profesor\n3. Modificar entrada\n4. Eliminar entrada.\n0. Salir del programa.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				añadirAlumno();
				
				break;
			case 2:
				añadirProfesor();
				
				break;
			case 3:
				modificarEntrada();
				
				break;
			case 4:
				eliminarEntrada();
				
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

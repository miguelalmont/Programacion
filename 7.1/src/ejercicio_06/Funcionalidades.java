package ejercicio_06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excepciones.ControlExcepciones;

public class Funcionalidades {

	static List<Obra> listaObras = new ArrayList<>();
	static List<Artista> listaArtistas = new ArrayList<>();
	static ControlExcepciones ex = new ControlExcepciones();
	static Scanner entrada = new Scanner(System.in);

	public static void añadeObra(Obra obra) {
		listaObras.add(obra);
	}

	public static void eliminaObra(int nInventario) {
		System.out.println(listaObras.removeIf(o -> o.getnInventario() == nInventario) ? "La obra se ha borrado"
				: "El numero no está en la lista.");
	}

	public static void buscaObra(int nInventario) {
		listaObras.stream().filter(o -> o.getnInventario() == nInventario).findAny()
				.ifPresentOrElse(o -> System.out.println(o.toString()), new Runnable() {
					public void run() {
						System.out.println("El número introducido no está en la  lista.");
					}
				});
	}
	
	public static void compararObras() {
		Obra temp1 = null;
		Obra temp2 = null;
		System.out.println("Introduce el numero de inventario de la primera obra.");
		int nObra1 = ex.controlInt();
		if (listaObras.stream().filter(o -> o.getnInventario() == nObra1).findAny().isPresent()) {
			temp1 = listaObras.stream().filter(o -> o.getnInventario() == nObra1).findAny().get();
		}
		System.out.println("Introduce el numero de inventario de la segunda obra.");
		int nObra2 = ex.controlInt();
		if (listaObras.stream().filter(o -> o.getnInventario() == nObra2).findAny().isPresent()) {
			temp2 = listaObras.stream().filter(o -> o.getnInventario() == nObra1).findAny().get();
		}
		if (temp1 != null && temp2 != null) {
			if (temp1.equals(temp2))
				System.out.println("Las obras son iguales.");
			else
				System.out.println("Las obras son diferentes");
		}
		else {
			System.out.println("Alguna de las obras no esta en la lista.");
		}
	}
	
	public static int superficie() {
		int superficie = 0;
		for (Obra obra : listaObras) {
			if (obra instanceof Pintura)
				superficie += ((Pintura) obra).getDimensiones().getAlto()
						* ((Pintura) obra).getDimensiones().getAncho();
		}
		return superficie;
	}

	public static double masAlta() {
		Escultura masAlta = new Escultura();
		masAlta.setAltura(0);
		for (Obra obra : listaObras) {
			if (obra instanceof Escultura)
				if (masAlta.getAltura() < ((Escultura) obra).getAltura())
					masAlta = (Escultura) obra;
		}
		return masAlta.getnInventario();
	}

	public static void menu() {
		int key;
		do {
			System.out.println("Menú Galeria");
			System.out.println(
					"1. Añadir artista\n2. Añadir Escultura\n3. Añadir Pintura\n4. Buscar Obra\n5. Eliminar Obra.\n6. Calcular Superficie.\n7. Escultura mas alta.\n8. Comparar Obras.\n0. Salir del programa.");
			key = ex.controlInt();
			switch (key) {
			case 1:
				System.out.println("Introduce el nombre del artista:");
				String nombre = entrada.nextLine();
				System.out.println("Introduce el lugar de nacimiento:");
				String lugar = entrada.nextLine();
				System.out.println("Introduce la fecha de nacimiento:");
				LocalDate fechaNacimiento = ex.controlDate();
				System.out.println("Introduce la fecha de fallecimiento:");
				LocalDate fechaMuerte = ex.controlDate();

				listaArtistas.add(new Artista(nombre, lugar, fechaNacimiento, fechaMuerte));

				break;
			case 2:
				Escultura e = new Escultura();
				
				
				System.out.println("Introduce el numero de inventario:");
				int nInventario = ex.controlInt();
				if (listaObras.stream().noneMatch(o -> o.getnInventario() == nInventario)) {
					e.setnInventario(nInventario);
					System.out.println("Introduce el titulo de la escultura:");
					e.setTitulo(entrada.nextLine());
					System.out.println("Introduce el año de creacion:");
					e.setAnio(ex.controlInt());
					System.out.println("Introduce el nombre del artista:");
					Artista autor = listaArtistas.stream().filter(a -> a.getNombre().equalsIgnoreCase(entrada.nextLine()))
							.findAny().orElse(null);
					if (autor != null)
						e.setAutor(autor);
					else
						System.out.println("El autor introducido no esta en la lista.");
					System.out.println("Introduce el material:");
					e.setMaterial(entrada.nextLine());
					System.out.println("Introduce la altura:");
					e.setAltura(ex.controlDouble());
	
					añadeObra(e);
				}
				else
					System.out.println("El numero de obra ya existe en la lista.");

				break;
			case 3:
				Pintura p = new Pintura();
				System.out.println("Introduce el numero de inventario:");
				nInventario = ex.controlInt();
				if (listaObras.stream().noneMatch(o -> o.getnInventario() == nInventario)) {
					p.setnInventario(nInventario);
					System.out.println("Introduce el titulo de la pintura:");
					p.setTitulo(entrada.nextLine());
					System.out.println("Introduce el año de creacion:");
					p.setAnio(ex.controlInt());
					System.out.println("Introduce el nombre del artista:");
					Artista autor = listaArtistas.stream().filter(a -> a.getNombre().equalsIgnoreCase(entrada.nextLine())).findAny()
							.orElse(null);
					if (autor != null)
						p.setAutor(autor);
					else
						System.out.println("El autor introducido no esta en la lista.");
					System.out.println("Introduce las dimensiones:");
					Dimensiones d = new Dimensiones();
					System.out.println("Alto:");
					d.setAlto(ex.controlInt());
					System.out.println("Ancho:");
					d.setAncho(ex.controlInt());
					p.setDimensiones(d);
					System.out.println("Introduce el soporte:");
					p.setSoporte(entrada.nextLine());
	
					añadeObra(p);
				}
				else
					System.out.println("El numero de obra ya existe en la lista.");
				
				break;
			case 4:
				System.out.println("Introduce el numero de la obra:");
				buscaObra(ex.controlInt());

				break;
			case 5:
				System.out.println("Introduce el numero de la obra:");
				eliminaObra(ex.controlInt());
				break;
			case 6:
				System.out.println("La superficie total de todas las pinturas es: " + superficie());
				break;
			case 7:
				System.out.println("El numero de la escultura mas alta es: " + masAlta());
				break;
			case 8:
				compararObras();
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
}

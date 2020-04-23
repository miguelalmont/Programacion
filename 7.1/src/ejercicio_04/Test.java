/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Publicacion> listaPub = new ArrayList<>();
		Funcionalidades f = new Funcionalidades();
		
		listaPub.add(new Libro("L0001", "La Carretera", 2006));
		listaPub.add(new Libro("L0002", "1984", 1949));
		listaPub.add(new Libro("L0003", "La Historia Interminable", 1979));
		
		listaPub.add(new Revista("R0001", "Muy Interesante", 2001, 59));
		listaPub.add(new Revista("R0002", "Quo", 2012, 123));
		listaPub.add(new Revista("R0003", "National Geographic", 2019, 354));
		
		listaPub.stream().filter(p -> p.getCodigo().equals("L0001")).forEach(p -> ((Libro)p).prestar());
		listaPub.stream().forEach(p -> System.out.println(p.toString()));
		System.out.println(f.cuentaPrestados(listaPub));
		System.out.println(f.publicacionesAnterioresA(listaPub, 2010));
	}

}

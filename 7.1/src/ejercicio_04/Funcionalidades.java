/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_04;

import java.util.List;

public class Funcionalidades {
	
	public int cuentaPrestados(List<Publicacion> listaPub) {
		/*int cont = 0;
		for (Publicaciones i : listaPub) {
			if (i instanceof Libro && ((Libro) i).prestado()) {
				cont++;
			}
		}
		return cont;*/
		
		return (int) listaPub.stream().filter(p -> p instanceof Libro).filter(p -> ((Libro)p).prestado()).count();
	}
	
	public int publicacionesAnterioresA(List<Publicacion> listaPub, int anio) {
		return (int) listaPub.stream().filter(p -> p.getAnio() <= anio).count();
	}
}

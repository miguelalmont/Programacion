/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_04;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;
/**
 * 
 * @param codigo
 * @param titulo
 * @param anio
 */
	Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
	}

	@Override
	public String toString() {
		return super.toString()+(prestado ? " Prestado" : " No prestado");
	}

	@Override
	public void prestar() {
		this.prestado = true;
		
	}

	@Override
	public void devolver() {
		this.prestado = false;
		
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	
}

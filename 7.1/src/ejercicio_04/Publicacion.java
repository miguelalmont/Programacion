/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_04;

public abstract class Publicacion {
	
	private String codigo, titulo;
	private int anio;
/**
 * 
 * @param codigo
 * @param titulo
 * @param anio
 */
	Publicacion(String codigo, String titulo, int anio) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio = anio;
	}
/**
 * 
 * @return
 */
	public String getCodigo() {
		return codigo;
	}
/**
 * 
 * @return
 */
	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return codigo+" "+titulo+" "+anio;
	}
	
	
}

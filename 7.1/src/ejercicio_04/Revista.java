/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_04;

public class Revista extends Publicacion{
	
	private int numero;
/**
 * 
 * @param codigo
 * @param titulo
 * @param anio
 * @param numero
 */
	Revista(String codigo, String titulo, int anio, int numero) {
		super(codigo, titulo, anio);
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Nº"+numero;
	}
	
	
}

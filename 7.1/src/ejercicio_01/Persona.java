/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_01;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
/**
 * 
 * @param nombre
 * @param apellidos
 * @param dni
 */
	Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}
	
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
/**
 * 
 * @return
 */
	public String getApellidos() {
		return apellidos;
	}
	
/**
 * 
 * @param apellidos
 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
/**
 * 
 * @return
 */
	public String getDni() {
		return dni;
	}
	
/**
 * 
 * @param dni
 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}

/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_06;

import java.time.LocalDate;

public class Artista {
	
	private String nombre, lugarNacimiento;
	private LocalDate fechaNacimiento, fechaMuerte;
/**
 * 
 */
	Artista() {
		
	}
/**
 * 
 * @param nombre
 * @param lugarNacimiento
 * @param fechaNacimiento
 * @param fechaMuerte
 */
	Artista(String nombre, String lugarNacimiento, LocalDate fechaNacimiento, LocalDate fechaMuerte) {
		this.nombre = nombre;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaMuerte = fechaMuerte;
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
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
/**
 * 
 * @param lugarNacimiento
 */
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
/**
 * 
 * @return
 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
/**
 * 
 * @param fechaNacimiento
 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
/**
 * 
 * @return
 */
	public LocalDate getFechaMuerte() {
		return fechaMuerte;
	}
/**
 * 
 * @param fechaMuerte
 */
	public void setFechaMuerte(LocalDate fechaMuerte) {
		this.fechaMuerte = fechaMuerte;
	}
/**
 * 
 */
	public void muestra() {
		System.out.println(this.toString());
	}
	
	@Override
	public boolean equals(Object artista) {
		return super.equals(artista);
	}
	
	@Override
	public String toString() {
		return nombre+" "+lugarNacimiento+" Nacimiento:"+fechaNacimiento+" Muerte: "+fechaMuerte;
	}
}

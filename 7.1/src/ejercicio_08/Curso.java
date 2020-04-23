/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Curso {

	private String titulo;
	private LocalDate fechaInicio, fechaFin;
	private int nDias;
	private double precio;
	List<Alumno> matriculados = new ArrayList<>();
/**
 * 
 * @param titulo
 * @param fechaInicio
 * @param fechaFin
 * @param nDias
 * @param precio
 */
	Curso(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int nDias, double precio) {
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.nDias = nDias;
		this.precio = precio;
	}
/**
 * 
 * @return
 */
	public String getTitulo() {
		return titulo;
	}
/**
 * 
 * @return
 */
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
/**
 * 
 * @return
 */
	public LocalDate getFechaFin() {
		return fechaFin;
	}
/**
 * 
 * @return
 */
	public int getNDias() {
		return nDias;
	}
/**
 * 
 * @return
 */
	public double getPrecio() {
		return precio;
	}
/**
 * 
 * @return
 */
	public List<Alumno> getMatriculados() {
		return matriculados;
	}

	abstract public String expedirTitulo(Alumno alumno);

	abstract public void matricularse(Alumno alumno);

	public void listadoAlumno() {
		matriculados.stream().map(Alumno::toString).forEach(System.out::println);
		

	}
}

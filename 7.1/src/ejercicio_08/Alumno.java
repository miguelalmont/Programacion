/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre, dni;
	private double saldo;
	List<Curso> realizados = new ArrayList<>();
	List<Curso> matriculados = new ArrayList<>();
	private int asistencia;
/**
 * 
 * @param nombre
 * @param dni
 */
	Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 100;
	}
/**
 * 
 * @param nombre
 * @param dni
 * @param saldo
 */
	Alumno(String nombre, String dni, int saldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
/**
 * 
 * @param incremento
 */
	public void incrementarSaldo(double incremento) {
		this.saldo += incremento;
	}
/**
 * 
 * @param decremento
 */
	public void restarSaldo(double decremento) {
		this.saldo -= decremento;
	}
/**
 * 
 * @return
 */
	public List<Curso> getRealizados() {
		return realizados;
	}
/**
 * 
 * @return
 */
	public List<Curso> getMatriculados() {
		return matriculados;
	}
/**
 * 
 * @param curso
 * @return
 */
	public boolean consultarCurso(Curso curso) {
		return realizados.stream().anyMatch(c -> c.equals(curso));
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
 * @return
 */
	public String getDni() {
		return dni;
	}
/**
 * 
 * @return
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * 
 * @return
 */
	public int getAsistencia() {
		return asistencia;
	}
/**
 * 
 * @param asistencia
 */
	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}
	
	public String toString() {
		return dni+" "+nombre;
	}
}

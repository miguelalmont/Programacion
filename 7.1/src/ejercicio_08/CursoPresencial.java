/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_08;

import java.time.LocalDate;

public class CursoPresencial extends Curso{
	
	private int cupo, horasDiarias, nMinAsistencias, plazasLibres;
/**
 * 
 * @param titulo
 * @param fechaInicio
 * @param fechaFin
 * @param nDias
 * @param precio
 * @param cupo
 * @param horasDiarias
 * @param nMinAsistencias
 */
	CursoPresencial(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int nDias, double precio, int cupo, int horasDiarias, int nMinAsistencias) {
		super(titulo, fechaInicio, fechaFin, nDias, precio);
		this.cupo = cupo;
		this.horasDiarias = horasDiarias;
		this.nMinAsistencias = nMinAsistencias;
		this.plazasLibres = cupo;
	}
	
	@Override
	public String expedirTitulo(Alumno alumno) {
		if (matriculados.stream().anyMatch(a -> a.equals(alumno))
				&& !alumno.consultarCurso(this)
				&& alumno.getAsistencia() >= nMinAsistencias) {
			alumno.matriculados.remove(this);
			alumno.realizados.add(this);
			return "D/Da "+alumno.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+",\n en la modalidad Presencial, con una duración de "+this.horasDiarias*this.getNDias()+" horas.";
		}
		else {
			return null;
		}
	}
	
	@Override
	public void matricularse(Alumno alumno) {
		if (plazasLibres > 0) {
				if (alumno.getSaldo() >= this.getPrecio()) {
					this.matriculados.add(alumno);
					alumno.restarSaldo(this.getPrecio());
					alumno.matriculados.add(this);
					plazasLibres--;
					System.out.println("El alumno "+alumno.getNombre()+" ha sido matriculado en el curso "+this.getTitulo()+".");
				} else {
					System.out.println("El saldo del alumno "+alumno.getNombre()+" es insuficiente.");
				}
		} else {
			System.out.println("El cupo del curso "+this.getTitulo()+" esta completo.");
		}
	}
	
	public void asistencia(int nDia, Alumno alumno) {
		if (nDia > 0 && nDia <= this.getNDias() && this.matriculados.contains(alumno)) {
			alumno.setAsistencia(alumno.getAsistencia()+1);
			System.out.println("Asistencia del alumno "+alumno.getNombre()+" confirmada");
		}
		else {
			System.out.println("Error en la confirmación de asistencia.");
		}
	}
	
	@Override
	public String toString() {
		return this.getTitulo();
	}
}

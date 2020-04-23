/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_08;

import java.time.LocalDate;

public class CursoOnline extends Curso{

	private Curso prerequisitos;
/**
 * 
 * @param titulo
 * @param fechaInicio
 * @param fechaFin
 * @param nDias
 * @param precio
 * @param prerequisitos
 */
	CursoOnline(String titulo, LocalDate fechaInicio, LocalDate fechaFin, int nDias, double precio, Curso prerequisitos) {
		super(titulo, fechaInicio, fechaFin, nDias, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String expedirTitulo(Alumno alumno) {
		if (matriculados.stream().anyMatch(a -> a.equals(alumno))
				&& !alumno.consultarCurso(this)) {
			alumno.realizados.add(this);
			alumno.matriculados.remove(this);
			return "D/Da "+alumno.getNombre()+" ha realizado con aprovechamiento el curso: "+this.getTitulo()+",\n en la modalidad Presencial, con una duración de "+this.getNDias()+" dias.";
		}
		else {
			return null;
		}
	}

	@Override
	public void matricularse(Alumno alumno) {
		// TODO Auto-generated method stub
		if (prerequisitos == null)
			if (alumno.getSaldo() >= this.getPrecio()) {
				this.matriculados.add(alumno);
				alumno.restarSaldo(this.getPrecio());
				alumno.matriculados.add(this);
				System.out.println("El alumno "+alumno.getNombre()+" ha sido matriculado en el curso "+this.getTitulo()+".");
			} else {
				System.out.println("El saldo del alumno "+alumno.getNombre()+" es insuficiente.");
			}
		else {
			if (alumno.getSaldo() >= this.getPrecio()
					&& alumno.realizados.contains(prerequisitos)) {
				this.matriculados.add(alumno);
				alumno.restarSaldo(this.getPrecio());
				alumno.matriculados.add(this);
				System.out.println("El alumno "+alumno.getNombre()+" ha sido matriculado en el curso"+this.getTitulo()+".");
			} else {
				System.out.println("El saldo del alumno "+alumno.getNombre()+" es insuficiente o el alumno no cumple los requisitos.");
			}
		}
	}
	
	@Override
	public String toString() {
		return this.getTitulo();
	}
	
}

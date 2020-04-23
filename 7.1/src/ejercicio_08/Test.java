/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_08;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Pepe", "34678904");
		Alumno a2 = new Alumno("Andrea", "17679456");
		
		Curso cp = new CursoPresencial("Diseño de Bases de Datos", LocalDate.parse("2018-03-12"), LocalDate.parse("2018-03-12"), 1, 50, 20, 8, 1);
		Curso co = new CursoOnline("Administración de Bases de Datos", LocalDate.parse("2018-03-19"), LocalDate.parse("2018-03-21"), 5, 50, cp);
		
		cp.matricularse(a1);
		cp.matricularse(a2);
		cp.listadoAlumno();
		((CursoPresencial) cp).asistencia(1, a1);
		cp.matriculados.stream().forEach(a -> System.out.println(cp.expedirTitulo(a)));
		
		co.matricularse(a1);
		co.matriculados.stream().forEach(a -> System.out.println(co.expedirTitulo(a)));
		
	}

}

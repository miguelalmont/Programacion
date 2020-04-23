/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_02;

import java.util.List;
import java.util.ArrayList;

public class Test {
	
	static List<Usuario> u = new ArrayList<>();
	static Moderador m;
	static Administrador a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		u.add(m = new Moderador("migue"));
		u.add(a = new Administrador("paco"));
		
		u.stream().filter(us -> us.getNick().equals("migue")).findAny().ifPresent(us -> us.setEmail("correomod@adslZone.com"));
		u.stream().filter(us -> us.getNick().equals("migue")).findAny().ifPresent(us -> System.out.println(us.getEmail()));
		Administrador aTemp = (Administrador) u.stream().filter(us -> us instanceof Administrador).findAny().orElse(null);
		aTemp.baneosInc();
		System.out.println(aTemp.getNick());
	}

}

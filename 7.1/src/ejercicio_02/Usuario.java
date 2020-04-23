/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_02;

public abstract class Usuario {
	
	private int nMensajes;
	private String email, nick;
/**
 * 
 * @param nick
 */
	Usuario(String nick) {
		this.nick = nick;
	}
/**
 * 
 */
	public void incrementa() {
		nMensajes++;
	}
/**
 * 
 */
	public void decrementa() {
		nMensajes--;
	}
/**
 * 
 * @param email
 */
	public void modificaCorreo(String email) {
		this.email = email;
	}
/**
 * 
 * @param nick
 */
	public void setNick(String nick) {
		this.nick = nick;
	}
/**
 * 
 * @return
 */
	public String getEmail() {
		return email;
	}
/**
 * 
 * @param email
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * 
 * @return
 */
	public String getNick() {
		return nick;
	}
	
	
}

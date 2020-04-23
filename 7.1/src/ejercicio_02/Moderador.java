/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_02;

public class Moderador extends Usuario{
	
	private int nPapelera;
/**
 * 
 * @param nick
 */
	Moderador(String nick) {
		super(nick);
	}
/**
 * 
 */
	private void papeleraInc() {
		nPapelera++;
	}
/**
 * 
 * @return
 */
	public int getnPapelera() {
		return nPapelera;
	}
/**
 * 
 * @param nPapelera
 */
	public void setnPapelera(int nPapelera) {
		this.nPapelera = nPapelera;
	}
	
	
}

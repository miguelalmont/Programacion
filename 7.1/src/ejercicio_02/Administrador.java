/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_02;

public class Administrador extends Usuario{
	
	private int nPapelera, nBaneos;
/**
 * 
 * @param nick
 */
	Administrador(String nick) {
		super(nick);
	}
/**
 * 
 */
	public void papeleraInc() {
		nPapelera++;
	}
/**
 * 
 */
	public void baneosInc() {
		nBaneos++;
	}
/**
 * 
 * @param nick
 */
	public void cambiaNick(String nick) {
		super.setNick(nick);
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
/**
 * 
 * @return
 */
	public int getnBaneos() {
		return nBaneos;
	}
/**
 * 
 * @param nBaneos
 */
	public void setnBaneos(int nBaneos) {
		this.nBaneos = nBaneos;
	}
}

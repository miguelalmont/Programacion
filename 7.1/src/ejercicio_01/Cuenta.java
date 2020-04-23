/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_01;

public abstract class Cuenta {

	private long numeroCuenta;
	private double saldo;
	private Persona cliente;
/**
 * 
 * @param cliente
 * @param numeroCuenta
 */
	Cuenta(Persona cliente, long numeroCuenta) {
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0;
	}
/**
 * 
 * @return
 */
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
/**
 * 
 * @param numeroCuenta
 */
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
 * @param saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return
 */
	public Persona getCliente() {
		return cliente;
	}
/**
 * 
 * @param cliente
 */
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
/**
 * 
 * @param saldo
 */
	public void ingresar(double saldo) {
		this.saldo += saldo;
	}
/**
 * 
 * @param saldo
 */
	public abstract void retirar(double saldo);

	
	public void actualizarSaldo() {

	}
}

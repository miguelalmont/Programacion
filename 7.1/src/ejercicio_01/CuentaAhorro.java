/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_01;

public class CuentaAhorro extends Cuenta {

	private double interesVariable;
	private double saldoMinimo;
/**
 * 
 * @param cliente
 * @param numeroCuenta
 * @param saldoMinimo
 * @param interesVariable
 */
	CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo, double interesVariable) {
		super(cliente, numeroCuenta);
		this.saldoMinimo = saldoMinimo;
		this.setSaldo(saldoMinimo);
		this.interesVariable = interesVariable;
	}

	@Override
	public void retirar(double saldo) {
		if ((this.getSaldo() - saldo) < saldoMinimo) {
			this.setSaldo(getSaldo() - saldo);
		} else {
			System.out.println("El retiro no puede sobrepasar el saldo mínimo de su cuenta.");
		}
	}

	@Override
	public void actualizarSaldo() {
		this.setSaldo(getSaldo() + (getSaldo() * interesVariable / 100));
	}

	@Override
	public String toString() {
		return "Cuenta nº " + this.getNumeroCuenta() + " Saldo:" + this.getSaldo();
	}
/**
 * 
 * @param interesVariable
 */
	public void setInteresVariable(double interesVariable) {
		this.interesVariable = interesVariable;
	}

}

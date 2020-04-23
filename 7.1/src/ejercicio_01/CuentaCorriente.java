/**
 * Ejercicio 01: Banco
 * 
 * @author Miguel
 */
package ejercicio_01;

public class CuentaCorriente extends Cuenta {
/**
 * 
 * @param cliente
 * @param numeroCuenta
 */
	CuentaCorriente(Persona cliente, long numeroCuenta) {
		super(cliente, numeroCuenta);
	}

	@Override
	public void retirar(double saldo) {
		if((this.getSaldo() - saldo) >= 0) {
			this.setSaldo(this.getSaldo() - saldo);
		}
		else {
			System.out.println("No puede sacar más saldo del disponible.");
		}
	}

	@Override
	public void actualizarSaldo() {
		this.setSaldo(getSaldo() + (getSaldo() * 0.015));
	}

	@Override
	public String toString() {
		return "Cuenta nº " + this.getNumeroCuenta() + " Saldo:" + this.getSaldo();
	}
}

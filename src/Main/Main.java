package Main;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.agregarSaldo(3000);
			cb.retirarSaldo(1000);
			cb.obtenerSaldo();
			cb.modificarCredito(1000);
			cb.solicitarPrestamo(12000);
			cb.obtenerPrestamo();
		} catch (Exception e) {
		}
	}

}

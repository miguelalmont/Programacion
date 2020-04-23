package ejercicio_06;

public class Dimensiones {
	
	private int alto, ancho;
	
	Dimensiones () {
		
	}
	
	Dimensiones(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public String toString() {
		return alto+"x"+ancho;
	}
}

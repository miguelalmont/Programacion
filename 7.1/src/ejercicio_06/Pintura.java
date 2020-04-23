package ejercicio_06;

public class Pintura extends Obra{
	
	private Dimensiones dimensiones;
	private String soporte;
	
	Pintura() {
		
	}
	
	Pintura(String titulo, int nInventario, int anio, Artista autor, Dimensiones dimensiones, String soporte) {
		super(titulo, nInventario, anio, autor);
		this.dimensiones = dimensiones;
		this.soporte = soporte;
	}

	public Dimensiones getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimensiones dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Dimensiones: "+dimensiones.toString()+" Soporte: "+soporte;
	}
}

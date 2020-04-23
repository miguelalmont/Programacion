package ejercicio_06;

public class Escultura extends Obra{
	
	private String material;
	private double altura;
	
	Escultura() {
		
	}
	
	Escultura(String titulo, int nInventario, int anio, Artista autor, String material, double altura) {
		super(titulo, nInventario, anio, autor);
		this.material = material;
		this.altura = altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Material: "+material+" Altura: "+altura;
	}
}

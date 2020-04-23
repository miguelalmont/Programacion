package ejercicio_06;

public abstract class Obra {
	
	private String titulo;
	private int nInventario, anio;
	private Artista autor;
	
	Obra() {
		
	}
	
	Obra(String titulo, int nInventario, int anio, Artista autor) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.anio = anio;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getnInventario() {
		return nInventario;
	}
	public void setnInventario(int nInventario) {
		this.nInventario = nInventario;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Artista getAutor() {
		return autor;
	}
	public void setAutor(Artista autor) {
		this.autor = autor;
	}
	
	public void muestra() {
		System.out.println(this.toString());
	}
	
	@Override
	public boolean equals(Object obra) {
		return super.equals(obra);
	}
	
	@Override
	public String toString() {
		return nInventario+" "+titulo+" ("+anio+") Autor: "+autor.getNombre();
	}
}

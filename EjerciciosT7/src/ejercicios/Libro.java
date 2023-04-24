package ejercicios;

public class Libro {
	
	enum genero{
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}
	
	String titulo;
	String autor;
	String genero;
	int ejemplares;
	int prestados;
	
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		this.genero=genero.valueOf(genero);        
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public boolean Prestamo() {
		boolean disponible=false;
		
		if(ejemplares>0&&ejemplares>=prestados++) {
			prestados++;
			disponible=true;
		}
		
		return disponible;
	}
	
	public boolean Devolucion() {
		boolean devuelto=false;
		
		if(prestados>0) {
			devuelto=true;
			prestados--;
		}
		
		return devuelto;
	}
	
}

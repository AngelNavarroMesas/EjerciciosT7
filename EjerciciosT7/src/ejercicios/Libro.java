package ejercicios;

public class Libro {
	
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		
		
		public Libro() {
			
		}
		
		public Libro(String titulo, String autor, int ejemplares, int prestados) {
			this.titulo=titulo;
			this.autor=autor;
			this.ejemplares=ejemplares;
			this.prestados=prestados;
		}
		
		public boolean Prestamo() {
			boolean disponible;
			if(this.ejemplares>0&&this.ejemplares>=this.prestados++) {
				this.prestados++;
				disponible=true;
			}else {
				disponible=false;
			}
			return disponible;
		}
		
		public boolean Devolucion() {
			boolean devuelto;
			
			
			
		}
}

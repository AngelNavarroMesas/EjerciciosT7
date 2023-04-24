package ejercicios;

public class Punto {
	
	int x;
	int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void imprime() {
		System.out.println("("+x+","+y+")");
	}
	
	public void setXY(int nuevx, int nuevy) {
		x= nuevx;
		y= nuevy;
	}
	
	public void desplaza(int nuevx, int nuevy) {
		x+= nuevx;
		y+= nuevy;
	}
	
	public double distancia(Punto p) {
		double distancia;
		
		distancia =Math.sqrt(Math.pow((p.x-this.x), 2) + Math.pow(p.y-this.y, 2));
		
		return distancia;
	}
}

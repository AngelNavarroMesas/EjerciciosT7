package ejercicios;

public class CuentaCorriente {
	
	String dni;
	String nombre;
	double saldo;
	
	public CuentaCorriente(String dni, double saldo) {
		this.dni=dni;
		this.saldo=saldo;
	}
	
	public CuentaCorriente(String dni,String nombre, double saldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	public void SacarDinero(int i) {
		if(saldo-i>0) {
			this.saldo-=i;
		}else {
			System.out.println("No queda saldo en tu cuenta");
		}
	}
	
	public void IngresarDinero(int i) {
		this.saldo+=i;
	}
	
	public void MostrarInformacion() {
		System.out.println("DNI; "+dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Saldo: "+saldo);
	}
	
}

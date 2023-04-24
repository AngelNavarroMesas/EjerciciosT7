package ejercicios;

public class CuentaCorriente {
	
	enum sexo{
		Masculino, Femenino
	}
	
	String dni;
	String nombre;
	double saldo;
	String sexo;
	
	public CuentaCorriente(String dni, double saldo) {
		this.dni=dni;
		this.saldo=saldo;
	}
	
	public CuentaCorriente(String dni,String nombre, double saldo, String sexo) {
		this.dni=dni;
		this.nombre=nombre;
		this.saldo=saldo;
		this.sexo=sexo.valueOf(sexo);
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

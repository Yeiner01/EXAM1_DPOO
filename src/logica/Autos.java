package logica;

public abstract class Autos {
	protected double peso;
	protected double cilindraje;
	protected double tamaño;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public Autos(double peso, double cilindraje, double tamaño) { 
		
		this.peso = peso;
		this.cilindraje = cilindraje;
		this.tamaño = tamaño;
		
		
	}
	
	public abstract double autonomia();
	
}

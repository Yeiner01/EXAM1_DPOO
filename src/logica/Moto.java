package logica;

public class Moto extends Autos{

	public Moto(double peso, double cilindraje, double tamaño) {
		super(peso, cilindraje, tamaño);
	}

	@Override
	public double autonomia() {
		double proceso = 8* Math.pow(10, 4) / (this.cilindraje + (2*this.peso)) * this.tamaño;
		return    proceso;
	}

	
	
}

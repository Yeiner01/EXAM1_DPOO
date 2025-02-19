package logica;

public class Carro extends Autos {
		

		public Carro(double peso, double cilindraje, double tamaño) {
		super(peso, cilindraje, tamaño);
	
	}

		@Override
		public double autonomia() {
			
			return (15 * Math.pow(10, 4)) / (this.cilindraje * this.peso) * this.tamaño ;
		}
		
		
}

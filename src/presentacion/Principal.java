package presentacion;

import java.util.Scanner;

import logica.Autos;
import logica.Carro;
import logica.Moto;
 
public class Principal {
	private Scanner sc;
	
	public Principal() {
		this.sc = new Scanner(System.in);
		
		Autos a;
		
		a = new Carro(this.leerPesoC(), this.leerCilindrajeC(), this.leerTamañoC());
		System.out.println(a.autonomia());
		
		
		a = new Moto(this.leerPesoM(), this.leerCilindrajeM(), this.leerTamañoM());
		System.out.println(a.autonomia());
	}
	
	public double leerPesoC() {
		System.out.println("Digite el peso del carro:");
		double dato = this.sc.nextDouble();
		return dato;
	}
	public double leerCilindrajeC() {
		System.out.println("Digite el cilindraje del carro:");
		double pa = this.sc.nextDouble();
		return pa;
	}
	public double leerTamañoC() {
		System.out.println("Digite el tamaño del carro:");
		double to = this.sc.nextDouble();
		return to;
	}
	
	public double leerPesoM() {
		System.out.println("Digite el peso de la moto:");
		double dato = this.sc.nextDouble();
		return dato;
	}
	public double leerCilindrajeM() {
		System.out.println("Digite el cilindraje de la moto:");
		double pa = this.sc.nextDouble();
		return pa;
	}
	public double leerTamañoM() {
		System.out.println("Digite el tamaño de la moto:");
		double to = this.sc.nextDouble();
		return to;
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}

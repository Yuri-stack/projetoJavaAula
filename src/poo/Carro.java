package poo;

// A classe é o Molde
public class Carro {
	
	// Atributos
	String marca;
	int rodas;
	int portas;
	String modelo_motor;
	
	// Métodos
	public void locomover() {
		System.out.println("Estou me locomovendo...");		
	}
	
	public String parar() {
		return "Estou parando";
	}

}

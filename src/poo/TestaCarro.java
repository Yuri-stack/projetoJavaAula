package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar um objeto
		Carro c1 = new Carro();	// c1 é um objeto
		
		c1.marca = "Kombi";
		c1.portas = 4;
		
		c1.locomover();
		
		System.out.println("Marca: " + c1.marca);
		System.out.println("Qtd. Portas: " + c1.portas);

		System.out.println(c1.parar());
	}

}

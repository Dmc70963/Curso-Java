package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {

		// double números reais
		double raio = 3.4;
		
		/*
		 * Adicionando final na frente do double (Esse valor não pode ser alterado dentro do algoritmo) 
		 * Pois transformamos a vareavel pi em constante
		*/
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println(area);
		
		
		raio = 10;
		area = pi * raio * raio;
		// Concatenagem 
		System.out.println("Area = " + area + "m2.");
		
		
	}
}

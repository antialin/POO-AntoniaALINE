package numeros;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Pares p1 = new Pares(10);
		System.out.println("Soma de todos os pares:" + p1.somar());
		System.out.printf("Soma de todos os pares primos:" + p1.somaPrimos());
		
		Impares i1 = new Impares(8);
		System.out.println("\nSoma de todos os impares:" + i1.somar());
		System.out.printf("Soma de todos os impares primos:" + i1.somaPrimos());
		
		

	}

}

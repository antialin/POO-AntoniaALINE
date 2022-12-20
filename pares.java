package numeros;

public class Pares extends NumeroNatural {

	public Pares(int n) {
		super(n);
		
	}

	@Override
	public int somar() {
		int i = 0;
		for (i=0; i <= n; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}
	return soma;
	}
	@Override
	public int somaPrimos() {
		int i1 = 0;
		for (i1=0; i1 <= n; i1++) {
			for (int j = 2; j <= i1; j++) {
				if (i1 % j == 0) {
				
				} else {
					if (i1 % 2 == 0) {
						primos += i1;
					}
				}
			}
		}
	return primos;
	}
}

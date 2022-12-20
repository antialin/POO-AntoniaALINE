package numeros;

public abstract class NumeroNatural {
	protected int soma;
	protected int primos;
	protected int n;

	public NumeroNatural(int n) {
		super();
		this.n = n;
	}
	public abstract int somar(); {
		int i = 0;
		for (i=0; i <= n; i++) {
			soma += i;
		}
	}
	public abstract int somaPrimos(); {
		int i1 = 0;
		for (i1=0; i1 <= n; i1++) {
			for (int j = 2; j <= i1; j++) {
				if (i1 % j == 0) {
				
				} else {
					primos += i1;
				}
			}
		}
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}

}

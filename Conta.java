package conta;

public class Conta {
	private int         numero;
	private String correntista;  
	protected float      saldo;

	
	public Conta(int numero, String correntista) {
		super();
		this.numero = numero;
		this.correntista = correntista;
		this.saldo = 0;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public float getSaldo() {
		return saldo;
	}
	public float credito(float d) {
		if( d >= 0) {
			this.saldo = this.saldo + d;
		}
		return this.saldo;
	}
	public float debito(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
		return this.saldo;
	}
	public void mostraDados() {
		System.out.printf("Conta       : %d\n",this.numero);
		System.out.printf("Correntista : %s\n",this.correntista);
		System.out.printf("saldo       : %.02f\n",this.saldo);
	}

}

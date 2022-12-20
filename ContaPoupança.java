package conta;

public class ContaPoupanca extends Conta {
	private float rendimento;

	public ContaPoupanca(int numero, String correntista) {
		super(numero, correntista);
		// TODO Auto-generated constructor stub
	
    }
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
    public void render() {
    	this.saldo = this.saldo + rendimento;
    }
}

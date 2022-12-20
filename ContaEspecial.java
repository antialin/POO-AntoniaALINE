package conta;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numero, String correntista) {
		super(numero, correntista);
		// TODO Auto-generated constructor stub
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void limitar() {
		if( saldo <= limite) {
			System.out.println("atingiu o limite");
		} else {
	        return;
	    }
		
	}
}

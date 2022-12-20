package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Estudantes  e1,e2;
		
		e1 = new Estudantes(  2, "Abraao", 25, 07, 2003,1,7, 2018);
		e2 = new Estudantes();
		e2.setNome("Abraao");
		
		e1.mostraDados();

	}


}

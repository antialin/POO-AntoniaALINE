package classes;

public class Estudantes {
	
	private int         matricula;
	private String           nome;
	private int     diaNascimento;
	private int     mesNascimento;
	private int     anoNascimento;
	private int       codigoCurso;
	private int       codigoTurma;
	private int       anoIngresso;

	public Estudantes(int matricula, String nome, int diaNascimento, int mesNascimento, int anoNascimento, int codigoCurso, int codigoTurma, int anoIngresso) { super();
		
	    this.matricula = matricula;
		this.nome = nome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.codigoCurso = codigoCurso;
		this.codigoTurma = codigoTurma;
		this.anoIngresso = anoIngresso;
	}
	public Estudantes() {
		super();
		
	}

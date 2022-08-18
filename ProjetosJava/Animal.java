package Animais;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private String id;
	private String acao;
	
	public Animal(String nome, int idade, String id, String acao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.acao = acao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public void som() {
		
	}
	
	public void visualizar() {
		System.out.println("\n______________________________________________");
		System.out.println("\nNome do animal: "+this.getNome());
		System.out.println("Tipo do animal: "+this.getId());
		System.out.println("Idade do animal: "+this.getIdade());
		System.out.println("O animal está: "+this.getAcao());
		
	}	

}



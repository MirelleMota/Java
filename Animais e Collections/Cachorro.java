package Animais;

public class Cachorro extends Animal {

	
	public Cachorro(String nome, int idade, String id, String acao) {
		super(nome,idade,id,acao);
		
	}
	
	public void som() {
		super.som();
		System.out.println("Som que o animal faz: Latido");
	}

	public void visualizar() {
		super.visualizar();
		
	}
		
	
	

}

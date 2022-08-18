package Animais;

public class Cavalo extends Animal {
	
	
	public Cavalo(String nome, int idade, String id, String acao) {
		super(nome, idade,id,acao);
		
	}
	
	public void som() {
		super.som();
		System.out.println("Som que o animal faz: Relincho");
	}
	
	public void visualizar () {
		super.visualizar();
		
	}


}

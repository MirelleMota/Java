package Animais;

public class Preguiça extends Animal {
	
	
	public Preguiça(String nome, int idade,String id, String acao) {
		super(nome, idade,id, acao);
	}
	
	public void som() {
		super.som();
		System.out.println("Som que o animal faz: Balido");
	}
	
	public void visualizar () {
		super.visualizar();
		
	}
}

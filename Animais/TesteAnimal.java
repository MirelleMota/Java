package Animais;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Spyke", 5, "Cachorro", "Correndo");
		c1.visualizar();
		c1.som();
		
		
		
		Cavalo ca1 = new Cavalo("Spirit", 8,"Cavalo", "Correndo");
		ca1.visualizar();
		ca1.som();
		
		
		Preguiça p1 = new Preguiça ("Mafu", 12, "Preguiça", "Subindo em árvore");
		p1.visualizar();
		p1.som();
		
		

	}

}

package Animais;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList <String> itens = new ArrayList<String>();

        itens.add("Casaco");
        itens.add("Calça Jeans");
        itens.add("Camiseta T-Shirt");
        itens.add("Vestido");

        System.out.println(itens.toString());

        itens.remove(3);
        System.out.println(itens.toString());

        itens.set(1, "Blusa de lã");
        System.out.println(itens.toString());

	}

}

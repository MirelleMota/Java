package ExerciciosJava;

import java.util.Scanner;

public class Exercicio2Extra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias,meses,anos,idade;
		
		System.out.println("Entre com o total de dias: ");
		dias = leia.nextInt();
		
		anos = dias/365; // dias que o usu�rio entrou *365
		System.out.println("\nAnos: "+anos);
		
		meses = (dias%365)/30; //o resto da divis�o dividido por 30
		System.out.println("\nMeses: "+meses);
		
		dias = (dias%365)%30;
		System.out.println("\nDias "+dias); //o resto da divis�o dividido pelo resto da divis�o de 30(resultado)
		

	}

}

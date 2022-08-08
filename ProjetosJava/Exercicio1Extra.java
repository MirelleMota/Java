
package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1Extra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeemDias,anos,meses,dias;
		
		System.out.println("\nQual a sua idade? ");
		System.out.println("\nEntre com anos! ");
		anos = leia.nextInt();
		System.out.println("\nEntre com meses: ");
		meses = leia.nextInt();
		System.out.println("\nEntre com os dias: ");
		dias = leia.nextInt();
		
		idadeemDias = anos*365+meses*30+dias;
		
		System.out.println("\nA idade total em dias é de: "+idadeemDias);
		
		
		

	}

}

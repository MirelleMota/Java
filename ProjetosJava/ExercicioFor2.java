package ExerciciosJava;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

        int numero, x, par=0, impar=0;


        for (x=1;x<=10;x++)
        {
            System.out.println("\nEntre com um número: ");
            numero=leia.nextInt();

            if (numero%2==0)
            {
                par++;
            }
            if (numero%2!=0)
            {
                impar++;
            }
        }

        System.out.println("\nForam "+par+" pares e "+impar+" impares!");
			
			
		}
	}


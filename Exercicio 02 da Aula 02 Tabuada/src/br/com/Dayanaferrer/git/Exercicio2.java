/**
 * 
 */
package br.com.Dayanaferrer.git;

/**
 *Programa que solicite que o usuário informe um número e exiba a tabuada daquele número.
 */
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int multi;
		int tabuada;
		
		System.out.println("Informe um número inteiro: ");
		multi = scan.nextInt();  
									
		for (int i = 0; i <= 100; i++) {
        	tabuada = multi * i;
        	System.out.println(multi + " x " + i + " = " + tabuada);
        	  	
        }
		
	}

}

	
package org.generation.codigo5;

import java.util.Scanner;

public class Codigo5 {
	public static void main(String []args) {
		Scanner scann = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int c = scann.nextInt();
	   int n=c;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (n > 0) {
	    	int digito =(int)(n % 10);
	    	if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    		afo++;
	    		
	      		} else {
	      			noAfo++;
	      			
	      		}
	    	n /= 10;

	    }
	    if (afo > noAfo) {
		      System.out.println("El " + c + " es un número afortunado.");
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		    }
		
	}

	
}

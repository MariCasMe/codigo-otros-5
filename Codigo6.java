package org.generation.codigo5;

import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner scann=new Scanner(System.in);
	    int opcion = scann.nextInt();

	    int multiplo = (opcion == 1)? 5: 7;

	    for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {
	        System.out.print(e + " ");
	      }
	    }
	

	
	}
}

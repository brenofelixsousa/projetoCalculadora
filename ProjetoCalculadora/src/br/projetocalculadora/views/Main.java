package br.projetocalculadora.views;

import java.util.Scanner;

import br.projetocalculadora.controllers.GeneralCall;

public class Main {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite 0 quando quiser finlizar as operacoes");
		
		float valorAnterior=0;
		float valorFinal=0;
		int i=0;
		while(true){
			String simbolo="+";
			if(i>0){
				System.out.println("Digite a operacoes. Exemplo: +/-*");
				simbolo = (String)s.next();
			}
			System.out.println("Digite um numero:");
			float numero = s.nextFloat();
			if(numero==0){
				break;
			}
			
			valorFinal = GeneralCall.callOperation(valorAnterior, numero, simbolo);
			valorAnterior=valorFinal;
			i++;
		}
		
		System.out.println("Resultado: "+(valorFinal));
		
	}
	
}

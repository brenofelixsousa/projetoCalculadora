package br.projetocalculadora.controllers;

public class GeneralCall {

	private static Controller  som;
	private static Controller  sub;
	private static Controller  mul;
	private static Controller  div;
	
	
	public static float callOperation(float a,float b, String op){
		som=new SomaController();
		sub=new SubtracaoController();
		mul=new MultiplicacaoController();
		div=new DivisaoController();
		
		
		if(op.equals("+")){
			return som.callOperation(a,b);
		}else if(op.equals("-")){
			return sub.callOperation(a,b);
		}else if(op.equals("/")){
			return div.callOperation(a,b);
		}else if(op.equals("*")){
			return mul.callOperation(a,b);
		}
		
		return 0;
	}
	
}

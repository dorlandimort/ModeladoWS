package com.ulsa.util;
import java.util.Stack;

public class Evaluar {
	
	private String expr;
	
	public Evaluar(String p) {
		// TODO Auto-generated constructor stub
		this.expr=p;
	}
	
	public double resultado(){
		
		 String[] post = expr.split(" ");    
		    
		    //Declaración de las pilas
		    Stack < String > E = new Stack < String > (); //Pila entrada
		    Stack < String > P = new Stack < String > (); //Pila de operandos

		    //Añadir post (array) a la Pila de entrada (E)
		    for (int i = post.length - 1; i >= 0; i--) {
		      E.push(post[i]);
		    }

		    //Algoritmo de Evaluación Postfija
		    String operadores = "+-*/%^stlc"; 
		    while (!E.isEmpty()) {
		      if (operadores.contains("" + E.peek())) {
		    	if("s".equals(E.peek()) || "c".equals(E.peek()) || "l".equals(E.peek()) || "t".equals(E.peek())){
		    		
		    		 P.push(evaluar(E.pop(), P.pop()) + "");
		    		
		    	}else{
		    		P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
		    	}
		        
		      }else {
		        P.push(E.pop());
		      } 
		    }

		    //Mostrar resultados:
		   /* System.out.println("Expresion: " + expr);
		    System.out.println("Resultado: " + P.peek());*/

		  

		
		return Double.parseDouble(P.peek());
	}
	
	 private static double evaluar(String op, String n2, String n1) {
		    double num1 = Double.parseDouble(n1);
		    double num2 = Double.parseDouble(n2);
		    if (op.equals("+")) return (num1 + num2);
		    if (op.equals("-")) return (num1 - num2);
		    if (op.equals("*")) return (num1 * num2);
		    if (op.equals("/")) return (num1 / num2);
		    if (op.equals("%")) return (num1 % num2);
		    if (op.equals("^")) return (Math.pow(num1, num2));
		    return 0;
		  }
	 
	 private static double evaluar(String op,String n1) {
		    double num1 = Double.parseDouble(n1);
		    if (op.equals("s")) return (Math.sin(num1));
		    if (op.equals("c")) return (Math.cos(num1));
		    if (op.equals("t")) return (Math.tan(num1));
		    if (op.equals("l")) return (Math.log(num1));
		    
		    return 0;
		  }
}

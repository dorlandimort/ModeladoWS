package com.ulsa.util;
import java.util.Scanner;
import java.util.Stack;

public class PostFija {

		String leer="";
		 Stack < String > E = new Stack < String > ();
		 Stack < String > P = new Stack < String > ();
		 Stack < String > S = new Stack < String > ();


	public String convertir(String ecuacion){
	    //Depurar la expresion algebraica
	    String expr =depurar(ecuacion);

	    String[] arrayInfix = expr.split(" ");

	    //Declaración de las pilas



	    for (int i = arrayInfix.length - 1; i >= 0; i--) {
	        E.push(arrayInfix[i]);
	      }


	      //Algoritmo Infijo a Postfijo
	      while (!E.isEmpty()) {

	        switch (pref(E.peek())){
	          case 1:
	            P.push(E.pop());
	            break;
	          case 3:
	          case 5:
	        	  while(pref(P.peek()) >= pref(E.peek())) {
		              S.push(P.pop());
		            }
	        	  P.push(E.pop());
	        	  break;
	          case 4:
	            while(pref(P.peek()) >= pref(E.peek())) {
	              S.push(P.pop());
	            }
	            P.push(E.pop());
	            break;
	          case 6:
	        	  while(pref(P.peek()) >= pref(E.peek())) {
		              S.push(P.pop());
		            }
	        	  P.push(E.pop());
	        	  break;
	          case 2:
	            while(!P.peek().equals("(")) {
	              S.push(P.pop());
	            }
	            P.pop();
	            E.pop();
	            break;
	          default:
	            S.push(E.pop());
	        }
	      }

	      //Eliminacion de `impurezas´ en la expresiones algebraicas
	      String infix = expr.replace(" ", "");
	      String postfix = S.toString().replaceAll("[\\]\\[,]", "");

	      //Mostrar resultados:
	     // System.out.println("Expresion Infija: " + infix);
	     // System.out.println("Expresion Postfija: " + postfix);
	      return postfix;
	}

	public double resultado(double x , double y,String a){


		String exp = a;
		exp=exp.replaceAll("x", x+"");
		exp=exp.replaceAll("y", y+"");
		Evaluar e= new Evaluar(exp);
	     //System.out.println("resultado: " + e.resultado());
	      return e.resultado();
	}

	  //Depurar expresión algebraica
	  private static String depurar(String s) {
	    s = s.replaceAll("\\s+", ""); //Elimina espacios en blanco
	    s = s.replaceAll("sen", "s");
	    s = s.replaceAll("cos", "c");
	    s = s.replaceAll("tan", "t");
	    s = s.replaceAll("log", "l");
	    s = "(" + s + ")";
	    String simbols = "+-*/^()";
	    String str = "";


	    for (int i = 0; i < s.length(); i++) {
	      if (simbols.contains("" + s.charAt(i))) {
	        str += " " + s.charAt(i) + " ";
	      }else str += s.charAt(i);
	    }
	    return str.replaceAll("\\s+", " ").trim();
	  }

	  //Jerarquia de los operadores
	  private static int pref(String op) {
	    int prf = 99;
	    if (op.equals("s") || op.equals("c") || op.equals("t") || op.equals("l"))  prf = 6;
	    if (op.equals("^")) prf = 5;
	    if (op.equals("*") || op.equals("/")) prf = 4;
	    if (op.equals("+") || op.equals("-")) prf = 3;
	    if (op.equals(")")) prf = 2;
	    if (op.equals("(")) prf = 1;
	    return prf;
	  }
}

package com.java.project3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("����>>");
		
		float op1=s.nextFloat();
		String op=s.next();
		float op2=s.nextFloat();
		float res=0;
		
		switch(op) {
		      case "+":
		    	  res= op1+op2;
		    	 break;
		      case "-":
		    	  res = op1-op2;
		      case "*":
		    	  res = op1*op2;
		      case "/":
		    	  if(op2==0) {
		    		  System.out.print("0���� ���� �� �����ϴ�");
		    		  s.close(); 	  }
		    	  else 
		    		  {res = op1/op2;}
		    	  break;
		      default:
		    	  System.out.print("������.");
		    	  s.close();
		    	  break;
		      
		}
		System.out.print(op1+op+op2+"�� �������"+res);
		s.close();
	}
}




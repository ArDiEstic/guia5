package com.senati.eti;

import com.senati.eti.model.Calculadora1;
import java.util.Scanner;
public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora1 calc = new Calculadora1();
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Número 1: ");
		n1 = sc.nextFloat();
		
		System.out.print("Número 2: ");
		n2 = sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\n** NÚMEROS INGRESADOS **");
		System.out.println("------------------------");
		System.out.println("Primer número....: " + calc.getNumero1());
		System.out.println("Segundo número...: " + calc.getNumero2());
		
		System.out.println("\n** RESULTADOS **");
		System.out.println("----------------");
		System.out.println("1. Suma.........: " + calc.Suma());
		System.out.println("2. Resta........: " + calc.Resta());
		System.out.println("3. Producto.....: " + calc.Producto());
		System.out.println("4. División.....: " + calc.Division());
		System.out.println("5. Resto Entero.: " + calc.RestoEntero());
		
		

	}

}

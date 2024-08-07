package com.calculator.proyect.calculadora_PU;

public class Main{
	public static void main(String[] args) {

	    double num1 = 5;
	    double num2 = 3;

        Main calculadora = new Main(); // Crear una instancia de la clase para poder llamar al método calcular
        calculadora.calcular("SUMAR", num1, num2);
        calculadora.calcular("RESTAR", num1, num2);
        calculadora.calcular("MULTIPLICAR", num1, num2);
        calculadora.calcular("DIVIDIR", num1, num2);  
	}

	 public double calcular(String operacion, double num1, double num2) {
	        double resultado = 0.0;

	        switch (operacion) {
	            case "SUMAR":
	                System.out.println("El primer numero es: " + num1);
	                System.out.println("El segundo numero es: " + num2);
	                resultado = num1 + num2;
	                System.out.println("El resultado es: " + resultado);
	                break;
	            case "RESTAR":
	                System.out.println("El primer numero es: " + num1);
	                System.out.println("El segundo numero es: " + num2);
	                resultado = num1 - num2;
	                System.out.println("El resultado es: " + resultado);
	                break;
	            case "MULTIPLICAR":
	                System.out.println("El primer numero es: " + num1);
	                System.out.println("El segundo numero es: " + num2);
	                resultado = num1 * num2;
	                System.out.println("El resultado es: " + resultado);
	                break;
	            case "DIVIDIR":
	                System.out.println("El primer numero es: " + num1);
	                System.out.println("El segundo numero es: " + num2);
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                    System.out.println("El resultado es: " + resultado);
	                } else {
	                    System.out.println("Error: No se puede dividir por cero");
	                    throw new ArithmeticException("No se puede dividir por cero");
	                }
	                break;
	            default:
	                System.out.println("Operación no válida");
	        }

	        return resultado;
	    }
}


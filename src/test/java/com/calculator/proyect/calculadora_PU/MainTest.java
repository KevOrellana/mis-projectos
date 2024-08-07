package com.calculator.proyect.calculadora_PU;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;


public class MainTest {

    double num1 = 5;
    double num2 = 3;

    @Test
    public void testSumar() {
    	Main calculadora = new Main();
        assertEquals(8.0, calculadora.calcular("SUMAR", 5.0, 3.0), 0.0001);
    }

    @Test
    public void testRestar() {
    	Main calculadora = new Main();
        assertEquals(2.0, calculadora.calcular("RESTAR", 5.0, 3.0), 0.0001);
    }

    @Test
    public void testMultiplicar() {
    	Main calculadora = new Main();
        assertEquals(15.0, calculadora.calcular("MULTIPLICAR", 5.0, 3.0), 0.0001);
    }

    @Test
    public void testDividir() {
    	Main calculadora = new Main();
        assertEquals(1.6667, calculadora.calcular("DIVIDIR", 5.0, 3.0), 0.0001);
    }

    @Test
    public void testDividirPorCero() {
    	Main calculadora = new Main();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.calcular("DIVIDIR", 5.0, 0.0);
        });
    }
}

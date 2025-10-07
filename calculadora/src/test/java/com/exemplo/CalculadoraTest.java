package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void somarPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void somarComZero() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.somar(7, 0));
    }

    @Test
    void somarNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-5, calc.somar(-2, -3));
    }
    
    @Test
    void multiplicarPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void multiplicarPorZero() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.multiplicar(5, 0));
    }

    @Test
    void multiplicarComNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(-10, calc.multiplicar(-2, 5));
    }

}
package jd.piano.teclas;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaBlanca3Test {
    @Test
    public void test1(){
        TeclaBlanca3 teclaBlanca = new TeclaBlanca3(64);
        teclaBlanca.setColorPulsado(Color.BLUE);

        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(teclaBlanca);
        assertTrue(elementoVisualTester.hacerPrueba());
        fail("Poner barra roja");
    }
}
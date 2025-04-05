package jd.piano.teclas;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaBlanca1Test {
    @Test
    public void test1(){
        TeclaBlanca1 teclaBlanca = new TeclaBlanca1(60);
        teclaBlanca.setColorPulsado(Color.BLUE);

        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(teclaBlanca);
        if (elementoVisualTester.hacerPrueba() == false) {
            fail("Poner barra roja");
        }
    }
}
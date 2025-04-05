package jd.piano.teclas;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeclaBlanca2Test {
    @Test
    public void test1(){
        TeclaBlanca2 teclaBlanca = new TeclaBlanca2(62);
        teclaBlanca.setColorPulsado(Color.BLUE);

        ElementoVisualTester elementoVisualTester = new ElementoVisualTester();
        elementoVisualTester.setElementoVisual(teclaBlanca);
        if (elementoVisualTester.hacerPrueba() == false) {
            fail("Poner barra roja");
        }
    }

}